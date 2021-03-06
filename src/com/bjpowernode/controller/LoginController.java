package com.bjpowernode.controller;

import com.bjpowernode.entity.User;
import com.bjpowernode.model.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.controller
 * @Description: java类作用描述
 * @Author: admin
 * @CreateDate: 2020/12/12 16:53
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class LoginController {

    @Autowired
    IUserService userService;


    @RequestMapping("login")
    void login(){

    }

    @RequestMapping("saveLogin")
    String saveLogin(User user, HttpSession session){

        User userDB = userService.getByUserNameAndPwd(user.getUsername(),user.getPassword());

        if(userDB == null){//失败

            user.setMsg("登录失败，请检查用户名和密码是否匹配");

            return "login";

        }

        //登录成功
        session.setAttribute("LOGIN_USER",userDB);

        return "redirect:/";
    }

    @RequestMapping("logout")
    String logout(HttpSession session){

        session.removeAttribute("LOGIN_USER");

        return "redirect:/";
    }


}
