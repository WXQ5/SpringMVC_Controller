package com.abc.service.iservice;

import com.abc.dao.entity.Dept;

import java.util.List;

public interface IDeptService {
    int insertBatch();
    int insertDept(Dept dept);

    List<Dept> selectAll();
}
