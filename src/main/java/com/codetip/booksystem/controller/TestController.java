package com.codetip.booksystem.controller;

import com.codetip.booksystem.domain.User;
import com.codetip.booksystem.mapper.UserMapper;
import com.codetip.booksystem.service.UserService;
import com.codetip.booksystem.util.TestUser;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Date;

@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/test")
    @ResponseBody
    public Object test(@Valid User user, BindingResult bindingResult, String name, String truename, String remark, int orderno){
        JSONObject result = new JSONObject();
        user.setName(name);
        user.setOrderNo(orderno);
        user.setTrueName(truename);
        user.setCreateDateTime(new Date());
        user.setRemark(remark);
//        return userMapper.savaUser(user);
        if(bindingResult.hasErrors()){
            result.put("success", false);
            result.put("msg", bindingResult.getFieldError().getDefaultMessage());
            System.out.println(user.getTrueName());
            System.out.println(user.getOrderNo());
            System.out.println(user.getName());
            return result;
        }else {
            userMapper.savaUser(user);
            result.put("success", true);
            result.put("msg", "添加成功");
            return "success";
        }
    }

    @RequestMapping("test2")
    @ResponseBody
    public JSONObject test2(@Valid TestUser testUser, BindingResult bindingResult){
        JSONObject result = new JSONObject();
        if(bindingResult.hasErrors()){
            result.put("success", false);
            result.put("msg", bindingResult.getFieldError().getDefaultMessage());
            return result;
        }else {
            System.out.println(testUser.getId());
            result.put("success", true);
            result.put("msg", "添加成功");
            return result;
        }
    }
}
