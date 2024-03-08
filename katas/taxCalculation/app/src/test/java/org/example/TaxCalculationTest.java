package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxCalculationTest  {

    @Test
    void this_will_return_total_tax_for_book() {
        var product = new Product("Harry Potter", 99.0, false, Product.Type.BOOK);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(0.0, taxCalculation.calculateTaxFor(product));
    }

    @Test
    void this_will_return_total_tax_for_food() {
        var product = new Product("Chicken", 4.0, false, Product.Type.FOOD);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(0.0, taxCalculation.calculateTaxFor(product));
    }

    @Test
    void this_will_return_total_tax_for_medicine() {
        var product = new Product("Paracetamol", 2.0, false, Product.Type.MEDICINE);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(0.0, taxCalculation.calculateTaxFor(product));
    }

    @Test
    void this_will_return_total_tax_for_other_than_book_food_and_medicine() {
        var product = new Product("iPhone", 900.0, false, Product.Type.OTHER);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(90.00, taxCalculation.calculateTaxFor(product));
    }

    @Test
    void this_will_return_total_tax_for_imported_book() {
        var product = new Product("Guardian of Galaxy", 10.0, true, Product.Type.BOOK);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(0.5, taxCalculation.calculateTaxFor(product));
    }

    @Test
    void this_will_return_total_tax_for_imported_other() {
        var product = new Product("Samsung 42 inch", 234.0, true, Product.Type.OTHER);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(35.1, taxCalculation.calculateTaxFor(product));
    }
    
    @Test
    void this_will_return_total_tax_with_rounded_5_cents_for_imported_book() {
        var product = new Product("Java Programming", 100.0, true, Product.Type.BOOK);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(5.00, taxCalculation.calculateTaxFor(product));
    }

    @Test
    void this_will_return_total_tax_with_rounded_5_cents_for_other() {
        var product = new Product("Wireless Mouse", 10.1, false, Product.Type.OTHER);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(1.05, taxCalculation.calculateTaxFor(product));
    }

    @Test
    void this_will_return_total_tax_for_non_imported_book() {
        var product = new Product("Java Programming for Beginner", 12.49, false, Product.Type.BOOK);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(0.0, taxCalculation.calculateTaxFor(product));
    }




}
