package org.example;

public class Medicine extends Product{
    public Medicine(String name, Double price, boolean isImported, boolean isLuxury) {
        super(name, price, isImported, isLuxury);
    }
    public Medicine(String name, Double price, boolean isImported) {
        super(name, price, isImported, false);
    }

}
