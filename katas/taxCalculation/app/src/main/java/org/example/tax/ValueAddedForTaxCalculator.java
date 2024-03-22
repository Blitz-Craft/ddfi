package org.example.tax;

import org.example.Book;
import org.example.Food;
import org.example.Medicine;
import org.example.Product;

import static org.example.Constant.*;

public class ValueAddedForTaxCalculator {

    public  static double calculateTaxFor(Product product){
        return isExempted(product) ? NO_TAX : VALUE_ADDED_TAX;
    }

    private static boolean isExempted(Product product) {
        return product instanceof Book || product instanceof Food || product instanceof Medicine;
    }
}
