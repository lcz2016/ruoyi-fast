package com.ruoyi.project.school.grade.controller;

import java.util.List;

import com.ruoyi.project.school.teacher.domain.BusTeacher;
import com.ruoyi.project.school.teacher.service.IBusTeacherService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.school.grade.domain.GradeClass;
import com.ruoyi.project.school.grade.service.IGradeClassService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 年级管理Controller
 * 
 * @author lcz
 * @date 2023-04-03
 */
@Controller
@RequestMapping("/school/grade")
public class GradeClassController extends BaseController
{
    private String prefix = "school/grade";

    @Autowired
    private IGradeClassService gradeClassService;
    @Autowired
    private IBusTeacherService teacherService;

    @RequiresPermissions("school:grade:view")
    @GetMapping()
    public String grade()
    {
        return prefix + "/grade";
    }

    /**
     * 查询年级管理列表
     */
    @RequiresPermissions("school:grade:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GradeClass gradeClass)
    {
        startPage();
        List<GradeClass> list = gradeClassService.selectGradeClassList(gradeClass);
        return getDataTable(list);
    }

    /**
     * 导出年级管理列表
     */
    @RequiresPermissions("school:grade:export")
    @Log(title = "年级管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GradeClass gradeClass)
    {
        List<GradeClass> list = gradeClassService.selectGradeClassList(gradeClass);
        ExcelUtil<GradeClass> util = new ExcelUtil<GradeClass>(GradeClass.class);
        return util.exportExcel(list, "年级管理数据");
    }

    /**
     * 新增年级管理
     */
    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
        BusTeacher teacher = new BusTeacher();
        List<BusTeacher> teachers = teacherService.selectBusTeacherList(teacher);
        mmap.put("teachers",teachers);
        return prefix + "/add";
    }

    /**
     * 新增保存年级管理
     */
    @RequiresPermissions("school:grade:add")
    @Log(title = "年级管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GradeClass gradeClass)
    {
        return toAjax(gradeClassService.insertGradeClass(gradeClass));
    }

    /**
     * 修改年级管理
     */
    @RequiresPermissions("school:grade:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        GradeClass gradeClass = gradeClassService.selectGradeClassById(id);
        mmap.put("gradeClass", gradeClass);
        System.out.println(gradeClass.getStudentList());
        BusTeacher teacher = new BusTeacher();
        List<BusTeacher> teachers = teacherService.selectBusTeacherList(teacher);
        mmap.put("teachers",teachers);
        return prefix + "/edit";
    }

    /**
     * 修改保存年级管理
     */
    @RequiresPermissions("school:grade:edit")
    @Log(title = "年级管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GradeClass gradeClass)
    {
        return toAjax(gradeClassService.updateGradeClass(gradeClass));
    }

    /**
     * 删除年级管理
     */
    @RequiresPermissions("school:grade:remove")
    @Log(title = "年级管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(gradeClassService.deleteGradeClassByIds(ids));
    }
}
