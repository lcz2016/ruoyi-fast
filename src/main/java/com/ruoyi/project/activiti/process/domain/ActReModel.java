package com.ruoyi.project.activiti.process.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 流程配置对象 act_re_model
 * 
 * @author lcz
 * @date 2023-04-13
 */
public class ActReModel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 模型编号 */
    private String id;

    /**  */
    @Excel(name = "")
    private Long rev;

    /** 模型名称 */
    @Excel(name = "模型名称")
    private String name;

    /** 模型key */
    @Excel(name = "模型key")
    private String key;

    /**  */
    private String category;

    /** 最后更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastUpdateTime;

    /** 版本 */
    @Excel(name = "版本")
    private Long version;

    /**  */
    private String metaInfo;

    /**  */
    private String deploymentId;

    /**  */
    private String editorSourceValueId;

    /**  */
    private String editorSourceExtraValueId;

    /**  */
    @Excel(name = "")
    private String tenantId;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setRev(Long rev)
    {
        this.rev = rev;
    }

    public Long getRev()
    {
        return rev;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setKey(String key)
    {
        this.key = key;
    }

    public String getKey()
    {
        return key;
    }
    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getCategory()
    {
        return category;
    }
    public void setLastUpdateTime(Date lastUpdateTime)
    {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Date getLastUpdateTime()
    {
        return lastUpdateTime;
    }
    public void setVersion(Long version)
    {
        this.version = version;
    }

    public Long getVersion()
    {
        return version;
    }
    public void setMetaInfo(String metaInfo)
    {
        this.metaInfo = metaInfo;
    }

    public String getMetaInfo()
    {
        return metaInfo;
    }
    public void setDeploymentId(String deploymentId)
    {
        this.deploymentId = deploymentId;
    }

    public String getDeploymentId()
    {
        return deploymentId;
    }
    public void setEditorSourceValueId(String editorSourceValueId)
    {
        this.editorSourceValueId = editorSourceValueId;
    }

    public String getEditorSourceValueId()
    {
        return editorSourceValueId;
    }
    public void setEditorSourceExtraValueId(String editorSourceExtraValueId)
    {
        this.editorSourceExtraValueId = editorSourceExtraValueId;
    }

    public String getEditorSourceExtraValueId()
    {
        return editorSourceExtraValueId;
    }
    public void setTenantId(String tenantId)
    {
        this.tenantId = tenantId;
    }

    public String getTenantId()
    {
        return tenantId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("rev", getRev())
            .append("name", getName())
            .append("key", getKey())
            .append("category", getCategory())
            .append("createTime", getCreateTime())
            .append("lastUpdateTime", getLastUpdateTime())
            .append("version", getVersion())
            .append("metaInfo", getMetaInfo())
            .append("deploymentId", getDeploymentId())
            .append("editorSourceValueId", getEditorSourceValueId())
            .append("editorSourceExtraValueId", getEditorSourceExtraValueId())
            .append("tenantId", getTenantId())
            .toString();
    }
}
