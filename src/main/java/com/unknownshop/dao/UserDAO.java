package com.unknownshop.dao;

import com.unknownshop.entity.Users;
import com.unknownshop.util.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class UserDAO extends EntityDAO<Users, String> {

    @Override
    protected List<Users> selectBySql(String sql, Object... args) {
        List<Users> list = new ArrayList<Users>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Users us = new Users();
                us.setId(rs.getInt(1));
                us.setUsername(rs.getString(2));
                us.setFullname(rs.getString(3));
                us.setPassword(rs.getString(4));
                us.setEmail(rs.getString(5));
                us.setImgUrl(rs.getBytes(6));
                us.setRole(rs.getString(7));
                us.setIsDeleted(rs.getBoolean(8));
                list.add(us);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Users> getList() {
        String sql = "{CALL sp_selectUsers}";
        return this.selectBySql(sql);
    }

    @Override
    public int insert(Users us) {
        try {
            String sql = "{CALL sp_signUp(?,?,?,?,?,?)}";
            ResultSet rs = XJdbc.query(sql, us.getUsername(), us.getFullname(), us.getPassword(), us.getEmail(), us.getImgUrl(), us.getRole());
            rs.next();
            // 1 : Thành công, 2: Trùng tài khoản, 3: Trùng email
            return (int) rs.getObject(1);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public int update(Users us) {
        try {
            String sql = "{CALL sp_updateUser(?,?,?,?,?,?)}";
            ResultSet rs = XJdbc.query(sql, us.getFullname(), us.getPassword(), us.getEmail(), us.getImgUrl(), us.getRole(), us.getUsername());
            rs.next();
            return (int) rs.getObject(1);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

    }

    @Override
    public int delete(String key) {
        try {
            String sql = "{CALL sp_deleteUser(?)}";
            ResultSet rs = XJdbc.query(sql, key);
            rs.next();
            return (int) rs.getObject(1);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    public List<Object[]> getListOfArray(String sql,String[] cols,Object... args){
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql,args);
            
            while(rs.next()){
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            } 
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
    public int signIn(String username, String password,Users user) {
        try {
            String sql = "{CALL sp_signIn(?,?)}";
            ResultSet rs = XJdbc.query(sql, username, password);
            rs.next();
            if(rs.getInt(1) > 0){
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setFullname(rs.getString(3));
                user.setPassword(rs.getString(4));
                user.setEmail(rs.getString(5));
                user.setImgUrl(rs.getBytes(6));
                user.setRole(rs.getString(7));
                user.setIsDeleted(rs.getBoolean(8));
            }
            return rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    public int selectByUserName(String username ,Users user){
        try {
            String sql = "{CALL sp_selectByUserName(?)}";
            ResultSet rs = XJdbc.query(sql, username);
            rs.next();
            if(rs.getInt(1) > 0){
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setFullname(rs.getString(3));
                user.setPassword(rs.getString(4));
                user.setEmail(rs.getString(5));
                user.setImgUrl(rs.getBytes(6));
                user.setRole(rs.getString(7));
                user.setIsDeleted(rs.getBoolean(8));
            }
            return rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
        
    }
    
    public List<Object[]> selectRoles() {
        String sql = "{CALL sp_selectByRole}";
        String[] cols = {"roles"};
        return this.getListOfArray(sql, cols);
    }
    
    public int restoreUser(String username) {
        try {
            String sql = "{CALL sp_restoreUser(?)}";
            ResultSet rs = XJdbc.query(sql, username);
            rs.next();
            return rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    public List<Users> selectUsers(String roles){
        String sql = "{CALL sp_selectUsers(?)}";
        return selectBySql(sql, roles);
    }
    
    public List<Users> selectUsersDeleted(String roles){
        String sql = "{CALL sp_selectUsersDeleted(?)}";
        return selectBySql(sql, roles);
    }
    
    
}
