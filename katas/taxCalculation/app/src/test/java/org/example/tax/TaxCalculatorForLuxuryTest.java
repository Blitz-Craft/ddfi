package org.example.tax;

import org.example.Book;
import org.example.Food;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxCalculatorForLuxuryTest {
    @Test
    void ten_percent_tax_for_luxury_product() {
        var book = new Book("Guardian of Galaxy", 10.0,false, true);
        Assertions.assertEquals(10.0, TaxCalculatorForLuxury.calculateTaxFor(book));
    }

    @Test
    void no_tax_for_non_luxury_product() {
        var food = new Food("Grilled Lobster", 100.0, true, false);
        Assertions.assertEquals(0.0, TaxCalculatorForLuxury.calculateTaxFor(food));
    }

}
