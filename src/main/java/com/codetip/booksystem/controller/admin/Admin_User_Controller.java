package com.codetip.booksystem.controller.admin;


import com.codetip.booksystem.domain.User;
import com.codetip.booksystem.mapper.UserMapper;
import com.codetip.booksystem.service.UserService;
import com.codetip.booksystem.util.CryptographyUtil;
import com.codetip.booksystem.util.StringUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin/user")
public class Admin_User_Controller {



    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    @ResponseBody
    public JSONObject add(@Valid User user, BindingResult bindingResult){
        JSONObject result = new JSONObject();
        if(bindingResult.hasErrors()){
            result.put("success", false);
            result.put("msg", bindingResult.getFieldError().getDefaultMessage());
            return result;
        }else {
            user.setPwd(CryptographyUtil.md5(user.getPwd(),"java"));//对存入数据库的密码进行加密加盐
            user.setCreateDateTime(new Date());//这里两个是取当前存入数据库的时间插入数据库
            user.setUpdateDateTime(new Date());
            userMapper.savaUser(user);
            result.put("success", true);
            result.put("msg", "添加成功");
            return result;
        }
    }

    @RequestMapping("/update")
    @ResponseBody
    public JSONObject update(@Valid User user, BindingResult bindingResult){
        JSONObject result = new JSONObject();
        if(bindingResult.hasErrors()){
            result.put("success", false);
            result.put("msg", bindingResult.getFieldError().getDefaultMessage());
            return result;
        }else {
            if (!user.getPwd().equals(null)){
                user.setPwd(CryptographyUtil.md5(user.getPwd(),"java"));}//对存入数据库的密码进行加密加盐
            user.setUpdateDateTime(new Date());
            userMapper.updateUser(user);
            result.put("success", true);
            result.put("msg", "添加成功");
            return result;
        }
    }


    @ResponseBody
    @RequestMapping("/set_new_pwd")
    public JSONObject set_new_pwd(User user)throws Exception {
        JSONObject result = new JSONObject();
        user.setUpdateDateTime(new Date());
        if(StringUtil.isNotEmpty(user.getPwd())){
            user.setPwd(CryptographyUtil.md5(user.getPwd(),"java"));
        }
        userMapper.updateUser(user);
        result.put("success", true);
        result.put("msg", "修改成功");
        return result;
    }


    @ResponseBody
    @RequestMapping("/list")
    public Map<String, Object> list(@RequestParam(value = "page", required = false) Integer page,
                                    @RequestParam(value = "limit", required = false) Integer limit,
                                    HttpServletResponse response,
                                    HttpServletRequest request) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();

        List<User> userList = userMapper.findUserList(map, page-1, limit);
        long total = userMapper.getTotal(map);
        map.put("data", userList);
        map.put("count", total);
        map.put("code", 0);
        map.put("msg", "");
        return map;
    }



    @ResponseBody
    @RequestMapping("/delete")
    public JSONObject delete(@RequestParam(value = "ids", required = false) String ids) throws Exception {
        String[] idsStr = ids.split(",");
        JSONObject result = new JSONObject();
        for (int i = 0; i < idsStr.length; i++) {
            userMapper.deleteUser(Integer.parseInt(idsStr[i]));
        }
        result.put("success", true);
        return result;
    }
}