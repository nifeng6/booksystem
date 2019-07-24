package com.codetip.booksystem.mapper;

import com.codetip.booksystem.domain.Role;
import com.codetip.booksystem.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.util.List;
import java.util.Map;

public interface RoleMapper {
    @Select("select * from role where id=#{id}")
    User findById(int id);

    @Select("select * from role where name=#{name}")
    User findByName(String name);

    //增加用户
    @Insert("insert into role(name,true_name,order_no,create_date_time,update_date_time) values(#{name},#{trueName},#{orderNo},#{createDateTime},#{updateDateTime})")
    void savaUser(Role role);

    @Update("update role set name=#{name},true_name=#{trueName},order_no=#{orderNo},create_date_time=#{createDateTime},update_date_time=#{updateDateTime} where id=#{id}")
    void updateUser(Role role);

    @Delete("delete from role where id=#{id}")
    void deleteUser(int id);

    @Select("select *from role")//这里进行分页查询
    List<Role> findAll();



}
