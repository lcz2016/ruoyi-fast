package com.ruoyi.project.activiti.process.controller;

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
import com.ruoyi.project.activiti.process.domain.ActReModel;
import com.ruoyi.project.activiti.process.service.IActReModelService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 流程配置Controller
 * 
 * @author lcz
 * @date 2023-04-13
 */
@Controller
@RequestMapping("/activiti/process")
public class ActReModelController extends BaseController
{
    private String prefix = "activiti/process";

    @Autowired
    private IActReModelService actReModelService;

    @RequiresPermissions("activiti:process:view")
    @GetMapping()
    public String process()
    {
        System.out.println("测试进入");
        return prefix + "/process";
    }

    /**
     * 查询流程配置列表
     */
    @RequiresPermissions("activiti:process:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ActReModel actReModel)
    {
        startPage();
        List<ActReModel> list = actReModelService.selectActReModelList(actReModel);
        return getDataTable(list);
    }

    /**
     * 导出流程配置列表
     */
    @RequiresPermissions("activiti:process:export")
    @Log(title = "流程配置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ActReModel actReModel)
    {
        List<ActReModel> list = actReModelService.selectActReModelList(actReModel);
        ExcelUtil<ActReModel> util = new ExcelUtil<ActReModel>(ActReModel.class);
        return util.exportExcel(list, "流程配置数据");
    }

    /**
     * 新增流程配置
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存流程配置
     */
    @RequiresPermissions("activiti:process:add")
    @Log(title = "流程配置", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ActReModel actReModel)
    {
        return toAjax(actReModelService.insertActReModel(actReModel));
    }

    /**
     * 修改流程配置
     */
    @RequiresPermissions("activiti:process:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        ActReModel actReModel = actReModelService.selectActReModelById(id);
        mmap.put("actReModel", actReModel);
        return prefix + "/edit";
    }

    /**
     * 修改保存流程配置
     */
    @RequiresPermissions("activiti:process:edit")
    @Log(title = "流程配置", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ActReModel actReModel)
    {
        return toAjax(actReModelService.updateActReModel(actReModel));
    }

    /**
     * 删除流程配置
     */
    @RequiresPermissions("activiti:process:remove")
    @Log(title = "流程配置", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(actReModelService.deleteActReModelByIds(ids));
    }
}
