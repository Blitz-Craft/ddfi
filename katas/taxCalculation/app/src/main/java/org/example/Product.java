package org.example;

public class Product {
    private String name;
    private Double price;
    private boolean isImported;
    private String type;

    public Product(String name, Double price, boolean isImported, String type) {
        this.name = name;
        this.price = price;
        this.isImported = isImported;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isImported() {
        return isImported;
    }

    public void setImported(boolean imported) {
        isImported = imported;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }






}
