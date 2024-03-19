package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxCalculationTest  {


    @Test
    void additional_price_base_on_implied_tax_for_imported_and_luxury_for_other() {
        var product = new Product("Louis Vuitton", 1000.0, true, true);
        var priceCalculation = new PriceCalculator();
        Assertions.assertEquals(250.0, priceCalculation.calculatePriceFor(product));
    }


    @Test
    void additional_price_base_on_implied_tax_with_rounded_5_cents_for_products() {
        var product = new Product("Wireless Mouse", 10.1, false);
        var priceCalculation = new PriceCalculator();
        Assertions.assertEquals(1.05, priceCalculation.calculatePriceFor(product));
    }

}
