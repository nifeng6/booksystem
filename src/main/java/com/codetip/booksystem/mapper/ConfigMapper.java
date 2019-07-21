package com.codetip.booksystem.mapper;


import com.codetip.booksystem.domain.Config;
import com.codetip.booksystem.domain.User;
import org.apache.ibatis.annotations.Select;

public interface ConfigMapper {
    @Select("select id,webName from config where id=#{id}")
    Config findId(int id);

    @Select("select * from user")
    User find();

}
