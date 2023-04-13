package com.ruoyi.project.activiti.process.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.activiti.process.mapper.ActReModelMapper;
import com.ruoyi.project.activiti.process.domain.ActReModel;
import com.ruoyi.project.activiti.process.service.IActReModelService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 流程配置Service业务层处理
 * 
 * @author lcz
 * @date 2023-04-13
 */
@Service
public class ActReModelServiceImpl implements IActReModelService 
{
    @Autowired
    private ActReModelMapper actReModelMapper;

    /**
     * 查询流程配置
     * 
     * @param id 流程配置主键
     * @return 流程配置
     */
    @Override
    public ActReModel selectActReModelById(String id)
    {
        return actReModelMapper.selectActReModelById(id);
    }

    /**
     * 查询流程配置列表
     * 
     * @param actReModel 流程配置
     * @return 流程配置
     */
    @Override
    public List<ActReModel> selectActReModelList(ActReModel actReModel)
    {
        return actReModelMapper.selectActReModelList(actReModel);
    }

    /**
     * 新增流程配置
     * 
     * @param actReModel 流程配置
     * @return 结果
     */
    @Override
    public int insertActReModel(ActReModel actReModel)
    {
        actReModel.setCreateTime(DateUtils.getNowDate());
        return actReModelMapper.insertActReModel(actReModel);
    }

    /**
     * 修改流程配置
     * 
     * @param actReModel 流程配置
     * @return 结果
     */
    @Override
    public int updateActReModel(ActReModel actReModel)
    {
        return actReModelMapper.updateActReModel(actReModel);
    }

    /**
     * 批量删除流程配置
     * 
     * @param ids 需要删除的流程配置主键
     * @return 结果
     */
    @Override
    public int deleteActReModelByIds(String ids)
    {
        return actReModelMapper.deleteActReModelByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除流程配置信息
     * 
     * @param id 流程配置主键
     * @return 结果
     */
    @Override
    public int deleteActReModelById(String id)
    {
        return actReModelMapper.deleteActReModelById(id);
    }
}
