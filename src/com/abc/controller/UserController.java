package com.abc.controller;

import com.abc.dao.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    @RequestMapping(value="/login.action")
    //由以下注释的login方法简化得来
    //通过对象的属性来接收请求参数,要求请求参数的名字和对象的属性名一致。
    //方法的返回值为String类型的，默认是页面的名字
    public String login(User user,HttpServletRequest request, Model model){
        int i= 100/0; //人工制造异常
        if("admin".equals(user.getUsername()) && "123456".equals(user.getPassword())){
            request.getSession().setAttribute("user",user);
            System.out.println(user.getUsername());
            //登录成功后，跳转到查询全部部门的action上，响应重定向redirect
            return "redirect:dept/selectall.action";

        }else{
            //model里存的数据就是向请求request里面添加属性addAttribute
            model.addAttribute("msg","用户名或密码错误");
            return "login";
        }
    }
/*    @RequestMapping(value="/login.action")
    //由以下注释的login方法简化得来
    //通过响应方法的参数来接收请求参数 该方法的参数名和请求参数参数名相同即可
    //方法的返回值为String类型的，默认是页面的名字
    public String login(String username, String password, Model model){
        if("admin".equals(username) && "123456".equals(password)){
           return "success";
        }else{
           //model里存的数据就是向请求request里面添加属性addAttribute
            model.addAttribute("msg","用户名或密码错误");
            return "login";
        }
    }*/
   /* //@RequestMapping("/login.action")用来设置响应的路径
    @RequestMapping(value="/login.action",method = RequestMethod.POST)*//*映射解析器会将其解析成正在的路径*//*
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        ModelAndView mv = new ModelAndView();*//*默认请求属性*//*
        if("admin".equals(username) && "123456".equals(password)){
            mv.setViewName("success");*//*只写页面的名字   真正的页面文件视图解析器会根据文件名解析*//*
        }else{
            mv.setViewName("login");
            mv.addObject("msg","用户名或密码错误");
        }
        return mv;
    }*/
}
