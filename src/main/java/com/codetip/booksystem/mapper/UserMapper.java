package com.codetip.booksystem.mapper;

import com.codetip.booksystem.domain.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from user where name=#{name}")
    User findByName(String name);
}
