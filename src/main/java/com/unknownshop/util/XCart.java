package com.unknownshop.util;

import com.unknownshop.entity.Products;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class XCart {
    public static HashMap<Integer, Products> listCart = new HashMap<>();
    public static String phone;
    public static String address;
    public static float totalPrice = 0;
    public static int totalQuantity = 0;
    
    // Phương thức thêm sản phẩm vào giỏ hàng
    public static void addProduct(Integer id, Products pro){
        Products product = new Products();
        product.setId(pro.getId());
        product.setImgUrl(pro.getImgUrl());
        product.setName(pro.getName());
        product.setQuantity(1);
        product.setPrice(pro.getPrice());
        
        totalQuantity += product.getQuantity();
        totalPrice += product.getPrice();
        
        XLabel.lblHomeTotalPrice.setText(XMoney.convertMoney(totalPrice)+" VNĐ");
        XLabel.lblHomeTotalQuantity.setText(""+totalQuantity);
        
        if(!listCart.containsKey(product.getId())){
            listCart.put(product.getId(), product);
        }else{
            int idSP = product.getId();
            float price = product.getPrice();
            listCart.get(idSP).setQuantity(listCart.get(idSP).getQuantity()+1);
            listCart.get(idSP).setPrice(listCart.get(idSP).getQuantity()*price);
        }
    }
    
    // Phương thức xóa 1 sản phẩm trong giỏ hàng
    public static void removeProduct(int index){
        Collection<Products> values = listCart.values();
        List<Products> list = new ArrayList<Products>(values);
        int idPro = list.get(index).getId();
        listCart.remove(idPro);
        totalPrice = 0;
        totalQuantity = 0;
        for (Products prd : listCart.values()) {
            totalQuantity += prd.getQuantity();
            totalPrice += prd.getPrice();
        }
        XLabel.lblHomeTotalPrice.setText(XMoney.convertMoney(totalPrice)+" VNĐ");
        XLabel.lblHomeTotalQuantity.setText(""+totalQuantity);
        XLabel.lblCartTotalPrice.setText(XMoney.convertMoney(totalPrice)+" VNĐ");
        XLabel.lblCartTotalQuantity.setText(""+totalQuantity);
    }
    
    // Phương thức xóa tất cả sản phẩm trong giỏ hàng
    public static void removeAll(){
        listCart.clear();
        totalPrice = 0;
        totalQuantity = 0;
        
        XLabel.lblHomeTotalPrice.setText("0 VNĐ");
        XLabel.lblHomeTotalQuantity.setText("0");
    }
    

    
}
