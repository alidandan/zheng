package com.bjpowernode.util;

import com.bjpowernode.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.util
 * @Description: java类作用描述
 * @Author: admin
 * @CreateDate: 2020/12/12 17:22
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class LoginInterceptor implements HandlerInterceptor {


    //Conroller已经被调用，只是视图没有渲染
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    //整个MVC流程已经全部结束
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    //此方法在进入Controller之前被调
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        User user = (User)request.getSession().getAttribute("LOGIN_USER");

        if(user == null){


            //向登录入口做重定向
            response.sendRedirect(request.getContextPath() + "/login");


            //未登录 返回false表示，无法闯过此拦截器
            return false;

        }

        //返回true表示，可以闯过此拦截器
        return true;


    }
}
