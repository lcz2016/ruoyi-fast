package com.ruoyi.project.school.grade.service.impl;

import java.util.List;

import com.ruoyi.project.school.student.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.project.school.grade.mapper.GradeClassMapper;
import com.ruoyi.project.school.grade.domain.GradeClass;
import com.ruoyi.project.school.grade.service.IGradeClassService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 年级管理Service业务层处理
 * 
 * @author lcz
 * @date 2023-04-03
 */
@Service
public class GradeClassServiceImpl implements IGradeClassService 
{
    @Autowired
    private GradeClassMapper gradeClassMapper;

    /**
     * 查询年级管理
     * 
     * @param id 年级管理主键
     * @return 年级管理
     */
    @Override
    public GradeClass selectGradeClassById(Long id)
    {
        return gradeClassMapper.selectGradeClassById(id);
    }

    /**
     * 查询年级管理列表
     * 
     * @param gradeClass 年级管理
     * @return 年级管理
     */
    @Override
    public List<GradeClass> selectGradeClassList(GradeClass gradeClass)
    {
        return gradeClassMapper.selectGradeClassList(gradeClass);
    }

    /**
     * 新增年级管理
     * 
     * @param gradeClass 年级管理
     * @return 结果
     */
    @Transactional
    @Override
    public int insertGradeClass(GradeClass gradeClass)
    {
        int rows = gradeClassMapper.insertGradeClass(gradeClass);
        insertStudent(gradeClass);
        return rows;
    }

    /**
     * 修改年级管理
     * 
     * @param gradeClass 年级管理
     * @return 结果
     */
    @Transactional
    @Override
    public int updateGradeClass(GradeClass gradeClass)
    {
        gradeClassMapper.deleteStudentByGrageClassId(gradeClass.getId());
        insertStudent(gradeClass);
        return gradeClassMapper.updateGradeClass(gradeClass);
    }

    /**
     * 批量删除年级管理
     * 
     * @param ids 需要删除的年级管理主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteGradeClassByIds(String ids)
    {
        gradeClassMapper.deleteStudentByGrageClassIds(Convert.toStrArray(ids));
        return gradeClassMapper.deleteGradeClassByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除年级管理信息
     * 
     * @param id 年级管理主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteGradeClassById(Long id)
    {
        gradeClassMapper.deleteStudentByGrageClassId(id);
        return gradeClassMapper.deleteGradeClassById(id);
    }

    /**
     * 新增学生管理信息
     * 
     * @param gradeClass 年级管理对象
     */
    public void insertStudent(GradeClass gradeClass)
    {
        List<Student> studentList = gradeClass.getStudentList();
        Long id = gradeClass.getId();
        if (StringUtils.isNotNull(studentList))
        {
            List<Student> list = new ArrayList<Student>();
            for (Student student : studentList)
            {
                student.setGrageClassId(id);
                list.add(student);
            }
            if (list.size() > 0)
            {
                gradeClassMapper.batchStudent(list);
            }
        }
    }
}
