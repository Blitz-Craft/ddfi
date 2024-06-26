package org.example.tax;

import org.example.Book;
import org.example.Food;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxCalculatorForImportedTest {
    @Test
    void five_percent_tax_for_imported_product() {
        var book = new Book("Guardian of Galaxy", 10.0, true);
        Assertions.assertEquals(5.0, TaxCalculatorForImported.calculateTaxFor(book));
    }

    @Test
    void no_tax_for_non_imported_product() {
        var food = new Food("Grilled Lobster", 100.0, false);
        Assertions.assertEquals(0.0, TaxCalculatorForImported.calculateTaxFor(food));
    }

}
