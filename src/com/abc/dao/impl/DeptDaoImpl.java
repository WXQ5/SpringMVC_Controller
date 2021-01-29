package com.abc.dao.impl;

import com.abc.controller.ConnectionUtill;
import com.abc.dao.entity.Dept;
import com.abc.dao.idao.IDeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DeptDaoImpl implements IDeptDao {
    @Autowired
    private JdbcTemplate template;
    @Override
    public int insert(Dept dept) {
        String sql = "insert into dept values(?,?,?)";
        Object[] params = {dept.getDeptno(),dept.getDname(),dept.getLoc()};
        return template.update(sql,params);
    }

    @Override
    public List<Dept> selectAll() {
        List<Dept> depts = new ArrayList<>();
        String sql = "select deptno,dname,loc from dept";
        Connection con = ConnectionUtill.getConnection();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet set = pst.executeQuery();
            while(set.next()){
                Dept dept = new Dept();
                dept.setDeptno(set.getInt(1));
                dept.setDname(set.getString(2));
                dept.setLoc(set.getString(3));
                //System.out.println(set.getString(2));
                depts.add(dept);
            }
            pst.close();
            con.close();
        } catch (Exception e) {
           e.printStackTrace();
        }
        System.out.println(depts.toString());
        return depts;

    }
}
