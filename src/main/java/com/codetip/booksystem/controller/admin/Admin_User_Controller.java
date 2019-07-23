package com.codetip.booksystem.controller.admin;


import com.codetip.booksystem.domain.User;
import com.codetip.booksystem.mapper.UserMapper;
import com.codetip.booksystem.service.UserService;
import com.codetip.booksystem.util.CryptographyUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.Date;

@Controller
@RequestMapping("/admin/user")
public class Admin_User_Controller {

//
//
//    @Autowired
//    private UserService userService;
//
//    /**
//     *   /admin/user/add
//     */
//    @ResponseBody
//    @RequestMapping("/add")
//    public JSONObject add(@Valid User user  ,BindingResult bindingResult, HttpServletResponse response, HttpServletRequest request) throws Exception {
//        JSONObject result = new JSONObject();
//
//        if(bindingResult.hasErrors()){
//            result.put("success", false);
//            result.put("msg", bindingResult.getFieldError().getDefaultMessage());
//            return result;
//        }else{
//            user.setCreateDateTime((Timestamp) new Date());
//            user.setPwd(CryptographyUtil.md5(user.getPwd(), "java"));
//            userService.save(user);
//            result.put("success", true);
//            result.put("msg", "添加成功");
//            return result;
//        }
//    }
}