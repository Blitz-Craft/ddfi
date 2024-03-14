package org.example;

public class Product {
    private String name;
    private Double price;
    private boolean isImported;
    private boolean isLuxury;

    public Product(String name, Double price, boolean isImported) {
        this(name, price, isImported, false);
    }

    public Product(String name, Double price, boolean isImported, boolean isLuxury) {
        this.name = name;
        this.price = price;
        this.isImported = isImported;
        this.isLuxury = isLuxury;
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

    public boolean isLuxury() {return isLuxury;}

    public void setLuxury(boolean luxury) {
        isLuxury = luxury;
    }

}
