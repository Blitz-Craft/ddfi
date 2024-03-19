package org.example;

public class TaxCalculatorForImported{
    public static double calculateTaxFor(Product product){
        return product.isImported() ? Constant.IMPORTED_TAX : Constant.NO_TAX;
    }

}
