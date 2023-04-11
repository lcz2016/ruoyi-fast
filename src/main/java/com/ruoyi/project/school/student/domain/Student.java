package com.ruoyi.project.school.student.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 学生对象 bus_student
 * 
 * @author lcz
 * @date 2023-04-03
 */
public class Student extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键标识 */
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private Long phone;

    /** 性别 */
    @Excel(name = "性别")
    private Integer sex;

    /** 家庭住址 */
    @Excel(name = "家庭住址")
    private String address;

    /** 所属年级_班级 */
    @Excel(name = "所属年级_班级")
    private Long grageClassId;

    /** 所属年级 */
    @Excel(name = "所属年级")
    private String gradeCode;

    public String getGradeCode() {
        return gradeCode;
    }

    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    /** 所属班级 */
    @Excel(name = "所属班级")
    private String classCode;

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
        System.out.println("set"+birthday.toString());
        this.birthday = birthday;
    }

    public Date getBirthday()
    {
        System.out.println(birthday);
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
    public void setSex(Integer sex)
    {
        this.sex = sex;
    }

    public Integer getSex()
    {
        return sex;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
    public void setGrageClassId(Long grageClassId)
    {
        this.grageClassId = grageClassId;
    }

    public Long getGrageClassId()
    {
        return grageClassId;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("birthday", getBirthday())
            .append("phone", getPhone())
            .append("sex", getSex())
            .append("address", getAddress())
            .append("grageClassId", getGrageClassId())
            .toString();
    }
}
