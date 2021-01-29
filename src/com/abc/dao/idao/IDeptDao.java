package com.abc.dao.idao;

import com.abc.dao.entity.Dept;

import java.util.List;

public interface IDeptDao {
    int insert(Dept dept);

    List<Dept> selectAll();
}
