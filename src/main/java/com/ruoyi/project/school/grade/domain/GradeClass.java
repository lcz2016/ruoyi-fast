package com.ruoyi.project.school.grade.domain;

import java.util.List;

import com.ruoyi.project.school.student.domain.Student;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 年级管理对象 bus_grade_class
 * 
 * @author lcz
 * @date 2023-04-03
 */
public class GradeClass extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键标识 */
    private Long id;

    /** 所属年级 */
    @Excel(name = "所属年级")
    private String gradeCode;

    /** 所属班级 */
    @Excel(name = "所属班级")
    private String classCode;

    /** 班主任 */
    @Excel(name = "班主任")
    private Long teacherId;

    /** 年级_班级全名 */
    @Excel(name = "年级_班级全名")
    private String classFullName;

    /** 学年 */
    @Excel(name = "学年")
    private Integer gradeYear;

    /** 学生管理信息 */
    private List<Student> studentList;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setGradeCode(String gradeCode)
    {
        this.gradeCode = gradeCode;
    }

    public String getGradeCode()
    {
        return gradeCode;
    }
    public void setClassCode(String classCode)
    {
        this.classCode = classCode;
    }

    public String getClassCode()
    {
        return classCode;
    }
    public void setTeacherId(Long teacherId)
    {
        this.teacherId = teacherId;
    }

    public Long getTeacherId()
    {
        return teacherId;
    }
    public void setClassFullName(String classFullName)
    {
        this.classFullName = classFullName;
    }

    public String getClassFullName()
    {
        return classFullName;
    }
    public void setGradeYear(Integer gradeYear)
    {
        this.gradeYear = gradeYear;
    }

    public Integer getGradeYear()
    {
        return gradeYear;
    }

    public List<Student> getStudentList()
    {
        return studentList;
    }

    public void setStudentList(List<Student> studentList)
    {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("gradeCode", getGradeCode())
            .append("classCode", getClassCode())
            .append("teacherId", getTeacherId())
            .append("classFullName", getClassFullName())
            .append("gradeYear", getGradeYear())
            .append("studentList", getStudentList())
            .toString();
    }
}
