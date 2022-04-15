package com.unknownshop.dao;

import com.unknownshop.entity.ProductTypes;
import com.unknownshop.util.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class ProductTypeDAO extends EntityDAO<ProductTypes, Integer> {

    @Override
    protected List<ProductTypes> selectBySql(String sql, Object... args) {
        List<ProductTypes> list = new ArrayList<ProductTypes>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                ProductTypes entity = new ProductTypes();
                entity.setId(rs.getInt("id"));
                entity.setDescription(rs.getString("description"));
                entity.setUnit(rs.getString("unit"));
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
    public List<ProductTypes> getList() {
        String sql = "{CALL sp_selectProductTypes}";
        return this.selectBySql(sql);
    }

    @Override
    public int insert(ProductTypes pr) {
        try {
            String sql = "{CALL sp_insertProductTypes(?,?)}";
            ResultSet rs = XJdbc.query(sql, pr.getDescription(), pr.getUnit());
            rs.next();
            return (int) rs.getObject(1);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public int update(ProductTypes pr) {
        try {
            String sql = "{CALL sp_updateProductTypes(?,?,?)}";
            ResultSet rs = XJdbc.query(sql, pr.getDescription(), pr.getUnit(), pr.getId());
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
            String sql = "{CALL sp_deleteProductTypes(?)}";
            ResultSet rs = XJdbc.query(sql, key);
            rs.next();
            return (int) rs.getObject(1);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;

        }
    }
}
