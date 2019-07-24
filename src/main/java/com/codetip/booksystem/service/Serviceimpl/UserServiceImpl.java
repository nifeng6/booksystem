package com.codetip.booksystem.service.Serviceimpl;

import com.codetip.booksystem.domain.User;
import com.codetip.booksystem.mapper.UserMapper;
import com.codetip.booksystem.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }

//    @Override
//    public PageInfo findAll() {
//        PageHelper.startPage(1,3);
//        List<User> userList = userMapper.findAll();
//        PageInfo<User> pageInfo = new PageInfo<>(userList);
//        return pageInfo;
//    }

//    @Override
//    public User savaUser(User user) {
//        return userMapper.savaUser(user);
//    }
}
