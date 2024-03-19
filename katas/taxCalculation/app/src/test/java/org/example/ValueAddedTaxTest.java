package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValueAddedTaxTest {

    @Test
    void no_tax_for_books() {
        var book = new Book("Harry Potter", 99.0, false);
        Assertions.assertEquals(0.0, ValueAddedForTaxCalculator.calculateTaxFor(book));
    }
    @Test
    void no_tax_for_food() {
        var food = new Food("Chicken", 4.0, false);
        Assertions.assertEquals(0.0, ValueAddedForTaxCalculator.calculateTaxFor(food));
    }
    @Test
    void no_tax_for_medicine() {
        var medicine = new Medicine("Paracetamol", 2.0, false);
        Assertions.assertEquals(0.0, ValueAddedForTaxCalculator.calculateTaxFor(medicine));
    }
    @Test
    void ten_percent_tax_for_others() {
        var product = new Product("iPhone", 900.0, false);
        Assertions.assertEquals(10.0, ValueAddedForTaxCalculator.calculateTaxFor(product));
    }

}
