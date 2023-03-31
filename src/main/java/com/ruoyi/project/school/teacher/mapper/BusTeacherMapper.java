package com.ruoyi.project.school.teacher.mapper;

import java.util.List;
import com.ruoyi.project.school.teacher.domain.BusTeacher;

/**
 * teacherMapper接口
 * 
 * @author ruoyi
 * @date 2023-03-31
 */
public interface BusTeacherMapper 
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
     * 删除teacher
     * 
     * @param id teacher主键
     * @return 结果
     */
    public int deleteBusTeacherById(Long id);

    /**
     * 批量删除teacher
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBusTeacherByIds(String[] ids);
}
