package com.weixin.maillistsynchronization.Dao;



import com.weixin.maillistsynchronization.Model.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentDao {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "parentid", column = "parentid"),})
    /**
     * 新建一个部门
     */
    @Insert("INSERT INTO student (stu_no, stu_name, sex, myclass) VALUES(#{stuNo}, #{stuName}, #{sex}, #{myclass})")
    int save(Department department);
    /**
     * 查询整个部门树
     */
    @Select("SELECT * FROM student")
    List<Department> queryAll();
    /**
     * 按ParentID查询
     */
    @Select("")
    List<Department> queryByParentId(@Param("id") long id);
    /**
     * 按ID查询
     */
    @Select("")
    List<Department> queryById(@Param("id") long id);
    /**
     * 按部门名称查询
     */
    @Select("")
    List<Department> queryByName(@Param("name") String name);
    /**
     * 根据ID删除该部门
     */
    @Delete("DELETE FROM student WHERE id = #{id}")
    int deleteById(@Param("id") long id);
    /**
     * 根据ParentID删除该部门
     */
    @Delete("DELETE FROM student WHERE id = #{id}")
    int deleteByParentId(@Param("id") long id);
    /**
     * 根据学生ID更新部门信息
     */
    @Update("")
    int update(Department student);

}
