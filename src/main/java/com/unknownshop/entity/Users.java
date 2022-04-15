package com.unknownshop.entity;


public class Users {
    private int id;
    private String username;
    private String fullname;
    private String password;
    private String email;
    private byte[] imgUrl = null;
    private String role;
    private boolean isDeleted;

    @Override
    public String toString(){
        return this.role;
    }
// Contructor
    public Users() {
    }

    public Users(int id, String username, String fullname, String password, String email, byte[] imgUrl, String role, boolean isDeleted) {
        this.id = id;
        this.username = username;
        this.fullname = fullname;
        this.password = password;
        this.email = email;
        this.imgUrl = imgUrl;
        this.role = role;
        this.isDeleted = isDeleted;
    }

    

// Getter and Setter    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String pattern = "\\w+\\@\\w+(\\.\\w+)+";
        if(email.matches(pattern)){
            this.email = email;
        }
    }

    public byte[] getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(byte[] imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    
}
