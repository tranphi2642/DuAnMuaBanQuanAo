package com.unknownshop.dao;

import com.unknownshop.entity.Orders;
import com.unknownshop.util.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class OrderDAO extends EntityDAO<Orders, Integer> {

    @Override
    protected List<Orders> selectBySql(String sql, Object... args) {
        List<Orders> list = new ArrayList<Orders>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Orders od = new Orders();
                od.setId(rs.getInt(1));
                od.setAddress(rs.getString(2));
                od.setPhone(rs.getString(3));
                od.setCreatedDate(rs.getDate(4));
                od.setTotalPrice(rs.getFloat(5));
                od.setUserId(rs.getInt(6));
                od.setConfirm(rs.getBoolean(7));
                list.add(od);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public List<Orders> getList() {
        String sql = "{CALL sp_selectOrdersUnconfirmed}";
        return this.selectBySql(sql);
    }

    @Override
    public int insert(Orders od) {
        try {
            String sql = "{CALL sp_insertOrders(?,?,?,?,?)}";
            String cols = "orderId";
            ResultSet rs = XJdbc.query(sql, od.getAddress(), od.getPhone(), od.getCreatedDate(), od.getTotalPrice(), od.getUserId());
            rs.next();
            return rs.getInt(cols);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int update(Orders od) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override

    public int delete(Integer key) {
        try {
            String sql = "{CALL sp_deleteOrders(?)}";
            ResultSet rs = XJdbc.query(sql, key);
            rs.next();
            return (int) rs.getObject(1);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;

        }
    }

    public List<Object[]> confirmOrders(int orderId) {
        String sql = "{CALL sp_confirmOrder(?)}";
        String[] cols = {"id", "name", "quantityOrderDetails", "quantityProduct"};
        return this.getListOfArray(sql, cols, orderId);
    }

    public int deleteAll() {
        try {
            String sql = "{CALL sp_deleteAllUnconfirmOrders}";
            ResultSet rs = XJdbc.query(sql);
            rs.next();
            return (int) rs.getObject(1);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> getListUnconfirmOrders() {
        String sql = "{CALL sp_unconfirmedOrders}";
        String[] cols = {"id", "username", "phone", "address", "totalQuantity", "totalPrice"};
        return this.getListOfArray(sql, cols);
    }
    
    public List<Object[]> getListConfirmOrders() {
        String sql = "{CALL sp_selectConfirmedOrders}";
        String[] cols = {"id", "fullname", "phone", "address", "totalQuantity", "totalPrice"};
        return this.getListOfArray(sql, cols);
    }
    
    public List<Object[]> confirmAllOrders() {
        String sql = "{CALL sp_confirmAllOrders}";
        String[] cols = {"id", "name", "quantityOrderDetails", "quantityProduct"};
        return this.getListOfArray(sql, cols);
    }
}
