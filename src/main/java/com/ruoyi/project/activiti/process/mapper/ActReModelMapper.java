package com.ruoyi.project.activiti.process.mapper;

import java.util.List;
import com.ruoyi.project.activiti.process.domain.ActReModel;

/**
 * 流程配置Mapper接口
 * 
 * @author lcz
 * @date 2023-04-13
 */
public interface ActReModelMapper 
{
    /**
     * 查询流程配置
     * 
     * @param id 流程配置主键
     * @return 流程配置
     */
    public ActReModel selectActReModelById(String id);

    /**
     * 查询流程配置列表
     * 
     * @param actReModel 流程配置
     * @return 流程配置集合
     */
    public List<ActReModel> selectActReModelList(ActReModel actReModel);

    /**
     * 新增流程配置
     * 
     * @param actReModel 流程配置
     * @return 结果
     */
    public int insertActReModel(ActReModel actReModel);

    /**
     * 修改流程配置
     * 
     * @param actReModel 流程配置
     * @return 结果
     */
    public int updateActReModel(ActReModel actReModel);

    /**
     * 删除流程配置
     * 
     * @param id 流程配置主键
     * @return 结果
     */
    public int deleteActReModelById(String id);

    /**
     * 批量删除流程配置
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteActReModelByIds(String[] ids);
}
