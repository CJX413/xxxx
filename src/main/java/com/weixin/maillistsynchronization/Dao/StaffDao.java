package com.weixin.maillistsynchronization.Dao;


import com.weixin.maillistsynchronization.Model.Staff;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StaffDao {

    @Results({
        @Result(property = "userid", column = "userid"),
        @Result(property = "name", column = "name"),
        @Result(property = "department", column = "department"),
            @Result(property = "mobile", column = "mobile"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "email", column = "email"),
            @Result(property = "position", column = "position")
    })
    /**
     * 新建一个员工
     */
    @Insert("INSERT INTO student (stu_no, stu_name, sex, myclass) VALUES(#{stuNo}, #{stuName}, #{sex}, #{myclass})")
    int save(Staff staff);
    /**
     * 查询所有员工
     */
    @Select("SELECT * FROM student")
    List<Staff> queryAll();
    /**
     * 按userID查询
     */
    @Select("")
    List<Staff> queryByUserId(@Param("id") String userId);
    /**
     * 按名字查询
     */
    @Select("")
    List<Staff> queryByName(@Param("name") String name);
    /**
     * 按部门ID查询
     */
    @Select("")
    List<Staff> queryByDepartment(@Param("department") long department);
    /**
     * 按部门职务信息查询
     */
    @Select("")
    List<Staff> queryByPosition(@Param("position") String position);
    /**
     * 根据userID删除该员工
     */
    @Delete("DELETE FROM student WHERE id = #{id}")
    int deleteByUserId(@Param("userId") String userId);
    /**
     * 根据部门ID删除该部门的所有员工
     */
    @Delete("DELETE FROM student WHERE id = #{id}")
    int deleteByDepartment(@Param("department") long department);
    /**
     * 根据userId更新员工信息
     */
    @Update("")
    int update(Staff staff);

}
