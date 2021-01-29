package com.abc.service.impl;


import com.abc.dao.entity.Dept;
import com.abc.dao.idao.IDeptDao;
import com.abc.service.iservice.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DeptServiceImpl implements IDeptService {
    @Autowired()
    private IDeptDao deptDao;
    @Override
   // @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,readOnly = false)
    public int insertBatch() {
        int count = 0;
        for(int i=0;i<4; i++){
            deptDao.insert(new Dept(i,"test"+i,"大连"+i));
            count++;
        }
        return count;
    }

    @Override
    public int insertDept(Dept dept) {
        return deptDao.insert(dept);
    }

    @Override
    public List<Dept> selectAll() {
        return deptDao.selectAll();
    }
}
