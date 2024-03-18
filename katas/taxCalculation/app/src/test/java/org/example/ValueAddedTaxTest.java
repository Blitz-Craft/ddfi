package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValueAddedTaxTest {

    @Test
    void no_tax_for_books() {
        var book = new Book("Harry Potter", 99.0, false);
        Assertions.assertEquals(0.0, ValueAddedForTaxCalculator.calculatedTaxFor(book));
    }
    @Test
    void no_tax_for_food() {
        var food = new Food("Chicken", 4.0, false);
        Assertions.assertEquals(0.0, ValueAddedForTaxCalculator.calculatedTaxFor(food));
    }
    @Test
    void no_tax_for_medicine() {
        var medicine = new Medicine("Paracetamol", 2.0, false);
        Assertions.assertEquals(0.0, ValueAddedForTaxCalculator.calculatedTaxFor(medicine));
    }
    @Test
    void ten_percent_tax_for_others() {
        var product = new Product("iPhone", 900.0, false);
        Assertions.assertEquals(10.0, ValueAddedForTaxCalculator.calculatedTaxFor(product));
    }

    @Test
    void ten_percent_tax_for_food_which_contains_more_sugar() {
        var food = new Food("Donut", 4.0, false);
        food.setWeight(100.0);
        food.setPercentageOfSugar(6.0);
        Assertions.assertEquals(10.0, ValueAddedForTaxCalculator.calculatedTaxFor(food));
    }
    @Test
    void no_tax_for_food_which_contains_less_sugar() {
        var food = new Food("Biscuit", 4.0, false);
        food.setWeight(100.0);
        food.setPercentageOfSugar(5.0);
        Assertions.assertEquals(0.0, ValueAddedForTaxCalculator.calculatedTaxFor(food));
    }
}
