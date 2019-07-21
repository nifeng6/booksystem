package com.codetip.booksystem.controller;

import com.codetip.booksystem.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController {

    @Autowired
    private ServletContext servletContext;

    /**
     *# 请求首页
     */
    @RequestMapping("/")
    public String  index_1(HttpServletResponse res, HttpServletRequest req) throws Exception {
        return "redirect:/login";
    }

    /**
     *   #请求首页  /index
     */
    @RequestMapping("/index")
    public String index(HttpServletResponse  res,HttpServletRequest req) throws Exception {
        return "redirect:/login";
    }


    /**
     *    /login
     *    #后台 用户电脑登陆
     */
    @RequestMapping("/login")
    public String login(){
        return "/pc/login/login";
    }



    /**
     * # 后台主页
     */
    @RequestMapping("/admin/main")
    public String admin_main(){
        return "/admin/main";
    }

    @Autowired
    private ConfigService configService;
    @RequestMapping("/test")
    @ResponseBody
    public Object test(){
        return configService.find();
    }

}
