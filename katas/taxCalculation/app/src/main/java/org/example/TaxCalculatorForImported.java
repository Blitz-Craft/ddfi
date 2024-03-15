package org.example;

public class TaxCalculatorForImported extends TaxCalculator{
    public static double taxCalculateFor(Product product){
        double taxImplied = 0;
        if (product.isImported()) {
            taxImplied += 5.0;
        }
        return taxImplied;
    }

}
