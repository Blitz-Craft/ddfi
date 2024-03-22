package org.example.tax;

import org.example.Product;

import static org.example.Constant.*;

public class TaxCalculatorForLuxury {

    public static double calculateTaxFor(Product product){
        return product.isLuxury() ? LUXURY_TAX : NO_TAX;
    }
}
