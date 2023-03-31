package com.ruoyi.project.school.teacher.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * teacher对象 bus_teacher
 * 
 * @author ruoyi
 * @date 2023-03-31
 */
public class BusTeacher extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键标识 */
    private Long id;

    /** 老师名称 */
    @Excel(name = "老师名称")
    private String name;

    /** 出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private Long phone;

    /** 住址 */
    @Excel(name = "住址")
    private String address;

    /** 性别 */
    @Excel(name = "性别")
    private Integer sex;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public Date getBirthday()
    {
        return birthday;
    }
    public void setPhone(Long phone)
    {
        this.phone = phone;
    }

    public Long getPhone()
    {
        return phone;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
    public void setSex(Integer sex)
    {
        this.sex = sex;
    }

    public Integer getSex()
    {
        return sex;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("birthday", getBirthday())
            .append("phone", getPhone())
            .append("address", getAddress())
            .append("sex", getSex())
            .toString();
    }
}
