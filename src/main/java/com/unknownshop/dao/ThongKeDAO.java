package com.unknownshop.dao;

import com.unknownshop.util.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ThongKeDAO {
    // Doanh thu sản phẩm
    public List<Object[]> getProductRevenue(int nam , int thang, int id){ 
        String sql = "{Call sp_productRevenue(?,?,?)}";
        String[] cols = {"name","totalprice","quantity"};
        return this.getListOfArray(sql, cols, nam, thang ,id);
    }
    
    // Lấy danh thu theo năm
    public List<Object[]> getRevenueByYear(int year ){
        String sql = "{Call sp_revenueByYear(?)}";
        String[] cols = {"description","quantity","total"};
        return this.getListOfArray(sql, cols, year);
    }
    
    // Khách hàng thân thiết
    public List<Object[]> getLoyalCustomers(){ 
        String sql = "{Call sp_loyalCustomers}";
        String[] cols = {"fullname","username","purchases"};
        return this.getListOfArray(sql,cols);
    }
    
    // Số hóa đơn dc xác nhận
    public int getConfirmedOrdersThisMonth(){ 
        String sql = "{Call sp_confirmedOrdersThisMonth}";
        String[] cols = {"sl"};
        Object[] so = getListOfArray(sql, cols).get(0);
        return (int) so[0];
    }
    
    // Số hóa đơn chưa dc xác nhận
    public int getUnConfirmedOrdersThisMonth(){ 
        String sql = "{Call sp_unconfirmedOrdersThisMonth}";
        String[] cols = {"sl"};
        Object[] so = getListOfArray(sql, cols).get(0);
        return (int) so[0];
    }
    
    // Số sản phẩm dc bán
    public int getProductsSold(){ 
        String sql = "{Call sp_productsSold}";
        String[] cols = {"sl"};
        Object[] so = getListOfArray(sql, cols).get(0);
        return (int) so[0];
    }
    
    // Số doanh thu bán được
    public String getRevenueByMonth(int month, int year){ 
        String sql = "{Call sp_revenueOneMonth(?,?)}";
        String[] cols = {"result"};
        Object[] result = getListOfArray(sql, cols,month,year).get(0);
        return (String) result[0]; 
    }
    
    private List<Object[]> getListOfArray(String sql, String[] cols, Object...args){
        List<Object[]> list = new ArrayList<>();
        try{
            ResultSet rs =  XJdbc.query(sql,args);
            while(rs.next()){
                Object[] vals= new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
