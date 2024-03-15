package org.example;

public class TaxCalculatorForLuxury {
    public static double taxCalculateFor(Product product){
        double taxImplied = 0;
        if (product.isLuxury()) {
            taxImplied += 10.0;
        }
        return taxImplied;
    }
}
