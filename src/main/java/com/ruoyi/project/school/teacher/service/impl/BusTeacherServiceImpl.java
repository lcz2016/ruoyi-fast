package com.ruoyi.project.school.teacher.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.school.teacher.mapper.BusTeacherMapper;
import com.ruoyi.project.school.teacher.domain.BusTeacher;
import com.ruoyi.project.school.teacher.service.IBusTeacherService;
import com.ruoyi.common.utils.text.Convert;

/**
 * teacherService业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-31
 */
@Service
public class BusTeacherServiceImpl implements IBusTeacherService 
{
    @Autowired
    private BusTeacherMapper busTeacherMapper;

    /**
     * 查询teacher
     * 
     * @param id teacher主键
     * @return teacher
     */
    @Override
    public BusTeacher selectBusTeacherById(Long id)
    {
        return busTeacherMapper.selectBusTeacherById(id);
    }

    /**
     * 查询teacher列表
     * 
     * @param busTeacher teacher
     * @return teacher
     */
    @Override
    public List<BusTeacher> selectBusTeacherList(BusTeacher busTeacher)
    {
        return busTeacherMapper.selectBusTeacherList(busTeacher);
    }

    /**
     * 新增teacher
     * 
     * @param busTeacher teacher
     * @return 结果
     */
    @Override
    public int insertBusTeacher(BusTeacher busTeacher)
    {
        return busTeacherMapper.insertBusTeacher(busTeacher);
    }

    /**
     * 修改teacher
     * 
     * @param busTeacher teacher
     * @return 结果
     */
    @Override
    public int updateBusTeacher(BusTeacher busTeacher)
    {
        return busTeacherMapper.updateBusTeacher(busTeacher);
    }

    /**
     * 批量删除teacher
     * 
     * @param ids 需要删除的teacher主键
     * @return 结果
     */
    @Override
    public int deleteBusTeacherByIds(String ids)
    {
        return busTeacherMapper.deleteBusTeacherByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除teacher信息
     * 
     * @param id teacher主键
     * @return 结果
     */
    @Override
    public int deleteBusTeacherById(Long id)
    {
        return busTeacherMapper.deleteBusTeacherById(id);
    }
}
