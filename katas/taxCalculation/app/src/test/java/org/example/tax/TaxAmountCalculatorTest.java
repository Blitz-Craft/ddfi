package org.example.tax;

import org.example.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxAmountCalculatorTest {


    @Test
    void additional_price_base_on_implied_tax_for_imported_and_luxury_for_other() {
        var product = new Product("Louis Vuitton", 1000.0, true, true);
        Assertions.assertEquals(250.0, TaxAmountCalculator.calculateFor(product));
    }


    @Test
    void additional_price_base_on_implied_tax_with_rounded_5_cents_for_products() {
        var product = new Product("Wireless Mouse", 10.1, false);
        Assertions.assertEquals(1.05, TaxAmountCalculator.calculateFor(product));
    }

}
