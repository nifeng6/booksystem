package com.codetip.booksystem.service;

import com.codetip.booksystem.domain.User;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    User findByName(String name);
//    User savaUser(User user);

//    PageInfo<User> findAll();
}
