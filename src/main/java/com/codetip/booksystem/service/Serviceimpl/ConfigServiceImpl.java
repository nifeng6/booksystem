package com.codetip.booksystem.service.Serviceimpl;

import com.codetip.booksystem.domain.Config;
import com.codetip.booksystem.domain.User;
import com.codetip.booksystem.mapper.ConfigMapper;
import com.codetip.booksystem.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("configService")
public class ConfigServiceImpl implements ConfigService {

    @Autowired
    private ConfigMapper configMapper;
    @Override
    public Config findById(int id) {
        return configMapper.findId(id);
    }

    @Override
    public User find() {
        return configMapper.find();
    }
}
