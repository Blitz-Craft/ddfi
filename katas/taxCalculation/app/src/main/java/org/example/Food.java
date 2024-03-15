package org.example;

public class Food extends Product{

    private Double sugarWight;

    public Food(String name, Double price, boolean isImported, boolean isLuxury) {
        super(name, price, isImported, isLuxury);
    }

    public Food(String name, Double price, boolean isImported) {
        super(name, price, isImported, false);
    }

    public Double getSugarWight() {
        return sugarWight;
    }

    public void setSugarWight(Double sugarWight) {
        this.sugarWight = sugarWight;
    }
}
