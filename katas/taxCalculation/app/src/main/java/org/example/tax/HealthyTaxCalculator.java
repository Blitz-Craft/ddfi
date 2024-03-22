package org.example.tax;

import org.example.Food;
import org.example.Product;

import java.util.Objects;

import static org.example.Constant.*;
import static org.example.Food.*;

public class HealthyTaxCalculator {
    public static double calculateTaxFor(Product product){
        double taxImplied;
        if (Objects.requireNonNull(product) instanceof Food food && food.getPercentageOfSugar() > SUGAR_PERCENTAGE_LIMIT) {
            taxImplied = SUGAR_TAX;
        } else {
            taxImplied = NO_TAX;
        }
        return taxImplied;
    }
}
