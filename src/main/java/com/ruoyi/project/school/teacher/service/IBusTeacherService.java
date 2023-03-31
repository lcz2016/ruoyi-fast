package com.ruoyi.project.school.teacher.service;

import java.util.List;
import com.ruoyi.project.school.teacher.domain.BusTeacher;

/**
 * teacherService接口
 * 
 * @author ruoyi
 * @date 2023-03-31
 */
public interface IBusTeacherService 
{
    /**
     * 查询teacher
     * 
     * @param id teacher主键
     * @return teacher
     */
    public BusTeacher selectBusTeacherById(Long id);

    /**
     * 查询teacher列表
     * 
     * @param busTeacher teacher
     * @return teacher集合
     */
    public List<BusTeacher> selectBusTeacherList(BusTeacher busTeacher);

    /**
     * 新增teacher
     * 
     * @param busTeacher teacher
     * @return 结果
     */
    public int insertBusTeacher(BusTeacher busTeacher);

    /**
     * 修改teacher
     * 
     * @param busTeacher teacher
     * @return 结果
     */
    public int updateBusTeacher(BusTeacher busTeacher);

    /**
     * 批量删除teacher
     * 
     * @param ids 需要删除的teacher主键集合
     * @return 结果
     */
    public int deleteBusTeacherByIds(String ids);

    /**
     * 删除teacher信息
     * 
     * @param id teacher主键
     * @return 结果
     */
    public int deleteBusTeacherById(Long id);
}
