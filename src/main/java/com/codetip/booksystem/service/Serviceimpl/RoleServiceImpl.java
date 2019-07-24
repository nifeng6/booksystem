package com.codetip.booksystem.service.Serviceimpl;

import com.codetip.booksystem.domain.Role;
import com.codetip.booksystem.domain.User;
import com.codetip.booksystem.mapper.RoleMapper;
import com.codetip.booksystem.service.RoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class RoleServiceImpl implements RoleService {

//        @Override
//    List<Role> list(Map<String, Object> map, Integer page, Integer pageSize) {
//        Pageable pageable = new PageRequest(0, 11, Sort.Direction.ASC, "orderNo");
//        Page<Role> list = roleDao.findAll(pageable);
//        return list.getContent();// 拿到list集合
//    }
        @Autowired
        private RoleMapper roleMapper;

//    Map<String,Object> data = new HashMap<>();
//        PageHelper.startPage(1,2);
//    List<User> users = userMapper.findAll();
//    PageInfo<User> pageInfo = new PageInfo<>(users);
    @Override
    public List<Role> findAll(Map<String, Object> map, Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        List<Role> role = roleMapper.findAll();
        PageInfo<Role> pageInfo = new PageInfo<>(role);
        return role;
    }
}
