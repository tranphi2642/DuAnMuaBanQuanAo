/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unknownshop.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class XJdbc {
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String dburl = "jdbc:sqlserver://anhduy281.database.windows.net:1433;database=unknown_shop;";;
    static String user = "anhduy281@anhduy281";
    static String pass = "Duy2812002";
    
    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
    public static PreparedStatement getStmt(String sql,Object... args) throws SQLException{
        Connection con = DriverManager.getConnection(dburl,user,pass);
        PreparedStatement stmt ;
        stmt = con.prepareCall(sql);
        
        
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i+1, args[i]);
        }
        
        return stmt;
    }
    
    public static ResultSet query(String sql,Object... args) throws SQLException{
        PreparedStatement stmt = XJdbc.getStmt(sql, args);
        return stmt.executeQuery();
    }
    
    public static Object value(String sql,Object... args){
        try {
            ResultSet rs = XJdbc.query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
    public static int update(String sql,Object... args){
        try {
            PreparedStatement stmt = XJdbc.getStmt(sql, args);
            try{
                return stmt.executeUpdate();
            }finally{
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dburl,user,pass);
    }
}
