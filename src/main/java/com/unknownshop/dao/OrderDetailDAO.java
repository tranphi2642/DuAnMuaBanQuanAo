package com.unknownshop.dao;

import com.unknownshop.entity.OrderDetails;
import com.unknownshop.util.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class OrderDetailDAO extends EntityDAO<OrderDetails, Integer>{

    @Override
    protected List<OrderDetails> selectBySql(String sql, Object... args) {
        List<OrderDetails> list = new ArrayList<OrderDetails>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                OrderDetails odt = new OrderDetails();
                odt.setOrderId(rs.getInt(1));
                odt.setProducId(rs.getInt(2));
                odt.setPrice(rs.getFloat(3));
                odt.setQuantity(rs.getInt(4));
                list.add(odt);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    @Override
    public List<OrderDetails> getList() {
        String sql = "{CALL sp_selectOrderDetail}";
        return this.selectBySql(sql);
    }
    @Override
    public int insert(OrderDetails entity) {
        try {
            String sql = "{CALL sp_insertOrderDetails(?,?,?,?)}";
            ResultSet rs = XJdbc.query(sql,entity.getOrderId(), entity.getProducId(),entity.getPrice(), entity.getQuantity());
            rs.next();
            return (int) rs.getObject(1);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    @Override
    public int update(OrderDetails od) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override

    public int delete(Integer key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    public List<Object[]> getListProduct(int orderId){
        String sql = "{CALL sp_selectOrderDetailsByOrderId(?)}";
        String[] cols = {"imgUrl", "name", "quantity", "price"};
        return this.getListOfArray(sql, cols, orderId);
    }
}
