package com.abc.interceptor;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeptInterceptor implements HandlerInterceptor {
    @Override
    //目标action之前执行
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        System.out.println("*****preHandle*******");
        System.out.println(request.getSession());
        return true;
    }

    @Override
    //目标action之后执行，视图解析之前执行
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("*****postHandle*******");
    }

    @Override
    //视图解析之后执行
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("**********afterCompletion******");
    }
}
