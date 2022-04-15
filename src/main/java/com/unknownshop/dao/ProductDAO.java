package com.unknownshop.dao;

import com.unknownshop.entity.Products;
import com.unknownshop.util.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class ProductDAO extends EntityDAO<Products, Integer> {

    @Override
    protected List<Products> selectBySql(String sql, Object... args) {
        List<Products> list = new ArrayList<Products>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Products entity = new Products();
                entity.setId(rs.getInt("id"));
                entity.setName(rs.getString("name"));
                entity.setPrice(rs.getFloat("price"));
                entity.setQuantity(rs.getInt("quantity"));
                entity.setImgUrl(rs.getBytes("imgUrl"));
                entity.setTypeId(rs.getInt("typeId"));
                entity.setIsDeleted(rs.getBoolean("isDeleted"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public List<Products> getList() {
        String sql = "{CALL sp_selectProducts}";
        return this.selectBySql(sql);
    }

    @Override
    public int insert(Products pr) {
        try {
            String sql = "{CALL sp_insertProduct(?,?,?,?,?)}";
            ResultSet rs = XJdbc.query(sql, pr.getName(), pr.getPrice(), pr.getQuantity(), pr.getImgUrl(), pr.getTypeId());
            rs.next();
            return (int) rs.getObject(1);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public int update(Products pr) {
        try {
            String sql = "{CALL sp_updateProduct(?,?,?,?,?,?)}";
            ResultSet rs = XJdbc.query(sql, pr.getName(), pr.getPrice(), pr.getQuantity(), pr.getImgUrl(), pr.getTypeId(), pr.getId());
            rs.next();
            return (int) rs.getObject(1);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;

        }

    }

    @Override
    public int delete(Integer key) {
        try {
            String sql = "{CALL sp_deleteProduct(?)}";
            ResultSet rs = XJdbc.query(sql, key);
            rs.next();
            return (int) rs.getObject(1);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;

        }
    }

    public List<Products> selectByIdPro(Integer key) {
        String sql = "{CALL sp_selectProductByTypeId(?)}";
        List<Products> list = this.selectBySql(sql, key);
        if (list.isEmpty()) {
            return new ArrayList<Products>();
        }
        return list;
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

    public List<Object[]> getListTypeId(int typeId) {
        String sql = "{CALL sp_selectProductsById(?)}";
        String[] cols = {"id", "name", "price", "quantity"};
        return this.getListOfArray(sql, cols, typeId);
    }

    public List<Products> getListDelete(Integer typeId) {
        String sql = "{CALL sp_selectProductsDeleted(?)}";
        List<Products> list = this.selectBySql(sql, typeId);
        if (list.isEmpty()) {
            return new ArrayList<Products>();
        }
        return list;
    }
    
    public int restore(Integer key) {
        try {
            String sql = "{CALL sp_restoreProducts(?)}";
            ResultSet rs = XJdbc.query(sql, key);
            rs.next();
            return (int) rs.getObject(1);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;

        }
    }
}
