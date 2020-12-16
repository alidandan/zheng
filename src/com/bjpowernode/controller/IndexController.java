package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.controller
 * @Description: java类作用描述
 * @Author: admin
 * @CreateDate: 2020/12/12 16:55
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class IndexController {


    @RequestMapping("index")
    ModelAndView index(){

        ModelAndView modelAndView = new ModelAndView();

        //可以调用Service
        modelAndView.setView(new InternalResourceView("/welcome.jsp"));

        return modelAndView;

    }
}
