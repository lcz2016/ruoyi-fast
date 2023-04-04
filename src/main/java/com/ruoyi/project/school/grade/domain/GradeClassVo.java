package com.ruoyi.project.school.grade.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import com.ruoyi.project.school.student.domain.Student;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.logging.log4j.util.Strings;

import java.util.List;

/**
 * 年级管理对象 bus_grade_class
 * 
 * @author lcz
 * @date 2023-04-03
 */
public class GradeClassVo extends GradeClass
{
    

    /** 班主任 */
    @Excel(name = "班主任")
    private String teacherName;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        String ps = super.toString();
        String s= new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("teacherName", getTeacherName())
            .toString();
        return Strings.concat(ps,s);
    }
}
