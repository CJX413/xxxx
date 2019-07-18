package com.weixin.maillistsynchronization.Service;

import com.weixin.maillistsynchronization.Model.Staff;

import java.util.List;

public interface StaffService {
    /**
     * 新建一个员工
     */
    int save(Staff staff);
    /**
     * 查询所有员工
     */
    List<Staff> queryAll();
    /**
     * 按userID查询
     */
    List<Staff> queryByUserId(String userId);
    /**
     * 按名字查询
     */
    List<Staff> queryByName(String name);
    /**
     * 按部门ID查询
     */
    List<Staff> queryByDepartment(long department);
    /**
     * 按部门职务信息查询
     */
    List<Staff> queryByPosition(String position);
    /**
     * 根据userID删除该员工
     */
    int deleteByUserId(String userId);
    /**
     * 根据部门ID删除该部门的所有员工
     */
    int deleteByDepartment(Integer department);
    /**
     * 根据userId更新员工信息
     */
    int update(Staff staff);
}
