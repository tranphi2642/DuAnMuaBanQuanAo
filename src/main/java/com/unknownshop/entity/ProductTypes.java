package com.unknownshop.entity;

public class ProductTypes {

    private int id;
    private String description;
    private String unit;
    private boolean isDeleted = false;

    @Override
    public String toString() {
        return description;
    }
// Contructor

    public ProductTypes() {

    }

    public ProductTypes(int id, String description, String unit, boolean isDeleted) {
        this.id = id;
        this.description = description;
        this.unit = unit;
        this.isDeleted = isDeleted;
    }

// Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public boolean isIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

}
