package com.abc.service.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeptServiceImplTest {
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptServiceImpl deptServiceImpl = (DeptServiceImpl) ac.getBean("deptServiceImpl");
        int count = deptServiceImpl.insertBatch();
        if(count > 0){
            System.out.println("批量插入成功");
        }else{
            System.out.println("批量插入失败");
        }
    }
}