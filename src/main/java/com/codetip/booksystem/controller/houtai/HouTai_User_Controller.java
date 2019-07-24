package com.codetip.booksystem.controller.houtai;

import com.codetip.booksystem.domain.Role;
import com.codetip.booksystem.domain.User;
import com.codetip.booksystem.mapper.RoleMapper;
import com.codetip.booksystem.mapper.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

public class HouTai_User_Controller {

//    @Resource
//    private UserMapper userMapper;
//    @Resource
//    private RoleMapper roleMapper;
//
//    /**
//     * /houtai/user/manage
//     */
//    @RequestMapping("/manage")
//    public ModelAndView manage() throws Exception {
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("pageTitle", "用户管理");
//        mav.addObject("title", "用户管理");
//        mav.setViewName("/admin/page/user/user_manage");
//        return mav;
//    }
//
//    /**
//     * /houtai/user/add
//     * @return
//     * @throws Exception
//     */
//    @RequestMapping("/add")
//    public ModelAndView add() throws Exception {
//        ModelAndView mav = new ModelAndView();
//
//        Map<String, Object> map = null;
////        List<Role> roleList = roleMapper.list(map, 0, 1000);
////        mav.addObject("roleList", roleList);
//
//
//        mav.addObject("flag", true);
//
//
//        mav.addObject("btn_text", "添加");
//        mav.addObject("save_url", "/admin/user/add");
//        mav.setViewName("/admin/page/user/add_update");
//        return mav;
//    }
//
//    /**
//     * /houtai/user/edit?id=1
//     * @return
//     * @throws Exception
//     */
//    @RequestMapping("/edit")
//    public ModelAndView edit(@RequestParam(value = "id", required = false) Integer id) throws Exception {
//        ModelAndView mav = new ModelAndView();
//
//        Map<String, Object> map = null;
////        List<Role> roleList = roleMapper.list(map, 0, 1000);
////        mav.addObject("roleList", roleList);
//
//        User user = userMapper.findById(id);
//        mav.addObject("user", user);
//        mav.addObject("btn_text", "修改");
//        mav.addObject("save_url", "/admin/user/update?id=" + id);
//        mav.setViewName("/admin/page/user/add_update");
//        return mav;
//    }
//
//    /**
//     * /houtai/user/set_new_pwd?id=1
//     * @return
//     * @throws Exception
//     */
//    @RequestMapping("/set_new_pwd")
//    public ModelAndView set_new_pwd(@RequestParam(value = "id", required = false) Integer id) throws Exception {
//        ModelAndView mav = new ModelAndView();
//        User user = userMapper.findById(id);
//        mav.addObject("user", user);
//        mav.addObject("btn_text", "修改");
//        mav.addObject("save_url", "/admin/user/set_new_pwd?id=" + id);
//        mav.setViewName("/admin/page/user/set_new_pwd");
//        return mav;
//    }

}
