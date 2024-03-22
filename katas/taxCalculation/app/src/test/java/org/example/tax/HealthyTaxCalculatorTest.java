package org.example.tax;

import org.example.Food;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HealthyTaxCalculatorTest {

    @Test
    void ten_percent_tax_for_food_which_contains_more_sugar() {
        var food = new Food("Donut", 4.0, false);
        food.setWeight(100.0);
        food.setPercentageOfSugar(6.0);
        Assertions.assertEquals(10.0, HealthyTaxCalculator.calculateTaxFor(food));
    }
    @Test
    void no_tax_for_food_which_contains_less_sugar() {
        var food = new Food("Biscuit", 4.0, false);
        food.setWeight(100.0);
        food.setPercentageOfSugar(5.0);
        Assertions.assertEquals(0.0, HealthyTaxCalculator.calculateTaxFor(food));
    }
}
