package org.example;

public class ValueAddedForTaxCalculator {

    public  static double calculatedTaxFor(Product product){
        double taxImplied = 0;

        switch (product) {
            case Book ignored -> taxImplied = 0.0;
            case Food food when food.getPercentageOfSugar() > 5.0 -> taxImplied += 10.0;
            case Food ignored -> taxImplied = 0.0;
            case Medicine ignored -> taxImplied = 0.0;
            default -> taxImplied += 10;
        }
        return taxImplied;
    }
}
