package org.example;

public class Food extends Product{
    public Food(String name, Double price, boolean isImported, boolean isLuxury) {
        super(name, price, isImported, isLuxury);
    }

    public Food(String name, Double price, boolean isImported) {
        super(name, price, isImported, false);
    }
}
