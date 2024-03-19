package org.example;

public class OtherTaxCalculator {
    public static double calculateTaxFor(Product product){
        double taxImplied = 0;
        switch (product) {
            case Food food when food.getPercentageOfSugar() > Food.SUGAR_PERCENTAGE_LIMIT -> taxImplied += Constant.SUGAR_TAX;
            default -> taxImplied = Constant.NO_TAX;
        }
        return taxImplied;
    }
}
