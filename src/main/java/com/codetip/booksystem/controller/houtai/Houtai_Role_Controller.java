package com.codetip.booksystem.controller.houtai;

import com.codetip.booksystem.domain.Role;
import com.codetip.booksystem.domain.RoleMenu;
import com.codetip.booksystem.mapper.RoleMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

public class Houtai_Role_Controller {

    @Resource
    private RoleMapper roleMapper;

    /**
     * /houtai/role/manage
     */
    @RequestMapping("/manage")
    public ModelAndView manage() throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("pageTitle", "角色管理");
        mav.addObject("title", "角色管理");
        mav.setViewName("/admin/page/role/role_manage");
        return mav;
    }


    /**
     * /houtai/role/add
     */
    @RequestMapping("/add")
    public ModelAndView add() throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("btn_text", "添加");
        mav.addObject("save_url", "/admin/role/add");
        mav.setViewName("/admin/page/role/add_update");
        return mav;
    }



    /**
     * /houtai/role/edit?id=1
     */
    @RequestMapping("/edit")
    public ModelAndView edit(@RequestParam(value = "id", required = false) Integer id) throws Exception {
        ModelAndView mav = new ModelAndView();
//        Role role = roleMapper.findId(id);
//        mav.addObject("role", role);
        mav.addObject("btn_text", "修改");
        mav.addObject("save_url", "/admin/role/update?id=" + id);
        mav.setViewName("/admin/page/role/add_update");
        return mav;
    }
}
