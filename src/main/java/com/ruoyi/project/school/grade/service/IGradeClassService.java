package com.ruoyi.project.school.grade.service;

import java.util.List;
import com.ruoyi.project.school.grade.domain.GradeClass;

/**
 * 年级管理Service接口
 * 
 * @author lcz
 * @date 2023-04-03
 */
public interface IGradeClassService 
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
     * 批量删除年级管理
     * 
     * @param ids 需要删除的年级管理主键集合
     * @return 结果
     */
    public int deleteGradeClassByIds(String ids);

    /**
     * 删除年级管理信息
     * 
     * @param id 年级管理主键
     * @return 结果
     */
    public int deleteGradeClassById(Long id);
}
