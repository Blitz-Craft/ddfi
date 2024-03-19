package org.example;

public class ValueAddedForTaxCalculator {

    public  static double calculateTaxFor(Product product){
        double taxImplied = 0;

        switch (product) {
            case Book ignored -> taxImplied = Constant.NO_TAX;
            case Food ignored -> taxImplied = Constant.NO_TAX;
            case Medicine ignored -> taxImplied = Constant.NO_TAX;
            default -> taxImplied += Constant.VALUE_ADDED_TAX;
        }
        return taxImplied;
    }
}
