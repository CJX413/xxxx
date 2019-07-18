package com.weixin.maillistsynchronization.Service;

import com.weixin.maillistsynchronization.Model.Department;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DepartmentService {
    /**
     * 新建一个部门
     */
    int save(Department department);
    /**
     * 查询整个部门树
     */
    List<Department> queryAll();
    /**
     * 按ParentID查询
     * 或者说查询该部门的直接下级部门
     */
    List<Department> queryByParentId(long id);
    /**
     * 按ID查询
     */
    List<Department> queryById(long id);
    /**
     * 按部门名称查询
     */
    List<Department> queryByName(String name);
    /**
     * 根据ID删除该部门
     */
    int deleteById(long id);
    /**
     * 根据ParentID删除该部门
     */
    int deleteByParentId(long id);
    /**
     * 根据学生ID更新部门信息
     */
    int update(Department student);
    /**
     * 查询该部门的所有下级部门
     */
    List<Department> queryAll();
}
