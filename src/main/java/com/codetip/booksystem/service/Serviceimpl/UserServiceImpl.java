package com.codetip.booksystem.service.Serviceimpl;

import com.codetip.booksystem.domain.User;
import com.codetip.booksystem.mapper.UserMapper;
import com.codetip.booksystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }
}
