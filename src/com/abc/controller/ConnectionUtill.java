package com.abc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtill {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC","root","abc123456");
            if(!con.isClosed()){
                System.out.println("连接成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
   /* public  static void closeConnection(Connection con){
        try {
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }*/
}
