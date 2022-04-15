package com.unknownshop.util;

import com.unknownshop.entity.Users;

public class Auth {
    public static Users user = null;
    public static boolean check = false;
    
    public static String getName(){
        String name = user.getFullname();
        int index = name.lastIndexOf(" ");
        if(index == -1) return name;
        else return name.substring(index);
    }
    
    public static void clear(){
        Auth.user = null;
    }
    
    public static boolean isLogin(){
        return Auth.user != null;
    }
    
}
