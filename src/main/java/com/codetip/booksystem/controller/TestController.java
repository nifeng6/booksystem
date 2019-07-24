package com.codetip.booksystem.controller;

import com.codetip.booksystem.domain.User;
import com.codetip.booksystem.mapper.UserMapper;
import com.codetip.booksystem.service.RoleService;
import com.codetip.booksystem.service.UserService;
import com.codetip.booksystem.util.TestUser;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.javafx.collections.MappingChange;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

//    @RequestMapping("/test")
//    @ResponseBody
//    public JSONObject test(@Valid User user, BindingResult bindingResult){
//        JSONObject result = new JSONObject();
//        if(bindingResult.hasErrors()){
//            result.put("success", false);
//            result.put("msg", bindingResult.getFieldError().getDefaultMessage());
//            return result;
//        }else {
//            user.setPwd(CryptographyUtil.md5(user.getPwd(),"java"));//对存入数据库的密码进行加密加盐
//            user.setCreateDateTime(new Date());//这里两个是取当前存入数据库的时间插入数据库
//            user.setUpdateDateTime(new Date());
//            userMapper.savaUser(user);
//            result.put("success", true);
//            result.put("msg", "添加成功");
//            return result;
//        }
//    }


//    @RequestMapping("/test")
//    @ResponseBody
//    public JSONObject update(@Valid User user, BindingResult bindingResult){
//        JSONObject result = new JSONObject();
//        if(bindingResult.hasErrors()){
//            result.put("success", false);
//            result.put("msg", bindingResult.getFieldError().getDefaultMessage());
//            return result;
//        }else {
//            if (!user.getPwd().equals(null)){
//            user.setPwd(CryptographyUtil.md5(user.getPwd(),"java"));}//对存入数据库的密码进行加密加盐
//            user.setUpdateDateTime(new Date());
//            userMapper.updateUser(user);
//            result.put("success", true);
//            result.put("msg", "添加成功");
//            return result;
//        }
//    }

//    @ResponseBody
//    @RequestMapping("/test")
//    public JSONObject set_new_pwd(User user)throws Exception {
//        JSONObject result = new JSONObject();
//        user.setUpdateDateTime(new Date());
//        if(StringUtil.isNotEmpty(user.getPwd())){
//            user.setPwd(CryptographyUtil.md5(user.getPwd(),"java"));
//        }
//        userMapper.updateUser(user);
//        result.put("success", true);
//        result.put("msg", "修改成功");
//        return result;
//    }

    @RequestMapping("test")
    @ResponseBody
    public Object test(){
        Map<String,Object> data = new HashMap<>();
        PageHelper.startPage(1,2);
        List<User> users = userMapper.findAll();
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return data;
    }

    @Autowired
    private RoleService roleService;
    @RequestMapping("test3")
    @ResponseBody
    public Object test3(){
        Map<String,Object> map = new HashMap<>();
        return roleService.findAll(map,1,1);
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
