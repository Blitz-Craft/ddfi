package org.example;

public class Food extends Product{
    private Double percentageOfSugar = 0.0;
    public Double getPercentageOfSugar() {
        return percentageOfSugar;
    }

    public void setPercentageOfSugar(Double percentageOfSugar) {
        this.percentageOfSugar = percentageOfSugar;
    }

    public Food(String name, Double price, boolean isImported, boolean isLuxury) {
        super(name, price, isImported, isLuxury);
    }

    public Food(String name, Double price, boolean isImported) {
        super(name, price, isImported, false);
    }

}
