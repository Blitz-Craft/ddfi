package org.example;

public class Book extends Product{


    public Book(String name, Double price, boolean isImported, boolean isLuxury) {
        super(name, price, isImported, isLuxury);
    }

    public Book(String name, Double price, boolean isImported) {
        super(name, price, isImported, false);
    }
}
