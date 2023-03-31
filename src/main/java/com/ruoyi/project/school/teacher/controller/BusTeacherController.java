package com.ruoyi.project.school.teacher.controller;

import java.util.List;
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
import com.ruoyi.project.school.teacher.domain.BusTeacher;
import com.ruoyi.project.school.teacher.service.IBusTeacherService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * teacherController
 * 
 * @author ruoyi
 * @date 2023-03-31
 */
@Controller
@RequestMapping("/school/teacher")
public class BusTeacherController extends BaseController
{
    private String prefix = "school/teacher";

    @Autowired
    private IBusTeacherService busTeacherService;

    @RequiresPermissions("school:teacher:view")
    @GetMapping()
    public String teacher()
    {
        return prefix + "/teacher";
    }

    /**
     * 查询teacher列表
     */
    @RequiresPermissions("school:teacher:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BusTeacher busTeacher)
    {
        startPage();
        List<BusTeacher> list = busTeacherService.selectBusTeacherList(busTeacher);
        return getDataTable(list);
    }

    /**
     * 导出teacher列表
     */
    @RequiresPermissions("school:teacher:export")
    @Log(title = "teacher", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BusTeacher busTeacher)
    {
        List<BusTeacher> list = busTeacherService.selectBusTeacherList(busTeacher);
        ExcelUtil<BusTeacher> util = new ExcelUtil<BusTeacher>(BusTeacher.class);
        return util.exportExcel(list, "teacher数据");
    }

    /**
     * 新增teacher
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存teacher
     */
    @RequiresPermissions("school:teacher:add")
    @Log(title = "teacher", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BusTeacher busTeacher)
    {
        return toAjax(busTeacherService.insertBusTeacher(busTeacher));
    }

    /**
     * 修改teacher
     */
    @RequiresPermissions("school:teacher:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        BusTeacher busTeacher = busTeacherService.selectBusTeacherById(id);
        mmap.put("busTeacher", busTeacher);
        return prefix + "/edit";
    }

    /**
     * 修改保存teacher
     */
    @RequiresPermissions("school:teacher:edit")
    @Log(title = "teacher", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BusTeacher busTeacher)
    {
        return toAjax(busTeacherService.updateBusTeacher(busTeacher));
    }

    /**
     * 删除teacher
     */
    @RequiresPermissions("school:teacher:remove")
    @Log(title = "teacher", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(busTeacherService.deleteBusTeacherByIds(ids));
    }
}
