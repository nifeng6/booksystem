package com.codetip.booksystem.mapper;

import com.codetip.booksystem.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
    @Select("select * from user where name=#{name}")
    User findByName(String name);

//    @Insert("insert into user(author,bianhao,create_date_time,danjia,image_url,name,num,order_no,press,update_date_time,book_type_id) values(#{author},#{bianhao},#{create_date_time},#{danjia},#{image_url},#{name},#{num},#{order_no},#{press},#{update_date_time},#{book_type_id}) ")
    @Insert("insert into user(name,true_name,order_no,create_date_time,remark) values(#{name},#{trueName},#{orderNo},#{createDateTime},#{remark})")
    User savaUser(User user);

}
