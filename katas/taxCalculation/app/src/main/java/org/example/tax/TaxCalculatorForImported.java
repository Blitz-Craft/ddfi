package org.example.tax;

import org.example.Product;

import static org.example.Constant.*;

public class TaxCalculatorForImported{
    public static double calculateTaxFor(Product product){
        return product.isImported() ? IMPORTED_TAX : NO_TAX;
    }

}
