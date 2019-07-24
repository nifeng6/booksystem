package com.codetip.booksystem.mapper;

import com.codetip.booksystem.domain.User;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from user where id=#{id}")
    User findById(int id);

    @Select("select * from user where name=#{name}")
    User findByName(String name);
//    @Insert("insert into user(author,bianhao,create_date_time,danjia,image_url,name,num,order_no,press,update_date_time,book_type_id) values(#{author},#{bianhao},#{create_date_time},#{danjia},#{image_url},#{name},#{num},#{order_no},#{press},#{update_date_time},#{book_type_id}) ")
    //增加用户
    @Insert("insert into user(name,true_name,order_no,create_date_time,remark,pwd,update_date_time,role_id) values(#{name},#{trueName},#{orderNo},#{createDateTime},#{remark},#{pwd},#{updateDateTime},#{roleId})")
    void savaUser(User user);

    @Update("update user set name=#{name},true_name=#{trueName},order_no=#{orderNo},create_date_time=#{createDateTime},remark=#{remark},pwd=#{pwd},update_date_time=#{updateDateTime},role_id=#{roleId} where id=#{id}")
    void updateUser(User user);

    @Delete("delete from user where id=#{id}")
    void deleteUser(int id);

    @Select("select *from user")//这里进行分页查询
    List<User> findUserList(Map<String, Object> map, Integer page, Integer pageSize);
    Long getTotal(Map<String,Object> map);


    @Select("select *from user")//这里进行分页查询
    List<User> findAll();
}
