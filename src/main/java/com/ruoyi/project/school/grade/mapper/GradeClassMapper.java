package com.ruoyi.project.school.grade.mapper;

import java.util.List;
import com.ruoyi.project.school.grade.domain.GradeClass;
import com.ruoyi.project.school.student.domain.Student;

/**
 * 年级管理Mapper接口
 * 
 * @author lcz
 * @date 2023-04-03
 */
public interface GradeClassMapper 
{
    /**
     * 查询年级管理
     * 
     * @param id 年级管理主键
     * @return 年级管理
     */
    public GradeClass selectGradeClassById(Long id);

    /**
     * 查询年级管理列表
     * 
     * @param gradeClass 年级管理
     * @return 年级管理集合
     */
    public List<GradeClass> selectGradeClassList(GradeClass gradeClass);

    /**
     * 新增年级管理
     * 
     * @param gradeClass 年级管理
     * @return 结果
     */
    public int insertGradeClass(GradeClass gradeClass);

    /**
     * 修改年级管理
     * 
     * @param gradeClass 年级管理
     * @return 结果
     */
    public int updateGradeClass(GradeClass gradeClass);

    /**
     * 删除年级管理
     * 
     * @param id 年级管理主键
     * @return 结果
     */
    public int deleteGradeClassById(Long id);

    /**
     * 批量删除年级管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGradeClassByIds(String[] ids);

    /**
     * 批量删除学生管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStudentByGrageClassIds(String[] ids);
    
    /**
     * 批量新增学生管理
     * 
     * @param studentList 学生管理列表
     * @return 结果
     */
    public int batchStudent(List<Student> studentList);
    

    /**
     * 通过年级管理主键删除学生管理信息
     * 
     * @param id 年级管理ID
     * @return 结果
     */
    public int deleteStudentByGrageClassId(Long id);
}
