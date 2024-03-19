package org.example;

public class TaxCalculatorForLuxury {
    public static double calculateTaxFor(Product product){
        return product.isLuxury() ? Constant.LUXURY_TAX : Constant.NO_TAX;
    }
}
