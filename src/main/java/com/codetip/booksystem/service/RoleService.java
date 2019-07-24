package com.codetip.booksystem.service;

import com.codetip.booksystem.domain.Role;
import com.codetip.booksystem.domain.User;
import java.util.Map;

import java.util.List;

public interface RoleService {

    List<Role> findAll(Map<String, Object> map, Integer page, Integer pageSize);

    //    @Override
//    List<Role> list(Map<String, Object> map, Integer page, Integer pageSize) {
//        Pageable pageable = new PageRequest(0, 11, Sort.Direction.ASC, "orderNo");
//        Page<Role> list = roleDao.findAll(pageable);
//        return list.getContent();// 拿到list集合
//    }

}
