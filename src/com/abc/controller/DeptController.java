package com.abc.controller;

import com.abc.dao.entity.Dept;
import com.abc.service.iservice.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DeptController {
    @Autowired
    private IDeptService deptService;
    @RequestMapping("/dept/selectall.action")
    //查询全部部门的方法，查询之后返回成功页面
    public String selectAll(Model model){
        List<Dept> depts = new ArrayList<Dept>();
        depts = deptService.selectAll();
        model.addAttribute("depts",depts);
        return "success";
    }
    @RequestMapping("/dept/insert.action")
    public String insert(Dept dept){
        deptService.insertDept(dept);
        return "redirect:selectall.action";
    }
}
