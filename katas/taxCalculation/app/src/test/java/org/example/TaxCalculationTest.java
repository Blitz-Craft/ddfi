package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxCalculationTest  {

    @Test
    void this_will_return_total_tax_for_book() {
        var book = new Book("Harry Potter", 99.0, false);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(0.0, taxCalculation.calculateTaxFor(book));
    }

    @Test
    void this_will_return_total_tax_for_food() {
        var food = new Food("Chicken", 4.0, false);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(0.0, taxCalculation.calculateTaxFor(food));
    }

    @Test
    void this_will_return_total_tax_for_medicine() {
        var medicine = new Medicine("Paracetamol", 2.0, false);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(0.0, taxCalculation.calculateTaxFor(medicine));
    }

    @Test
    void this_will_return_total_tax_for_other_than_book_food_and_medicine() {
        var otherProduct = new OtherProduct("iPhone", 900.0, false);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(90.00, taxCalculation.calculateTaxFor(otherProduct));
    }

    @Test
    void this_will_return_total_tax_for_imported_book() {
        var book = new Book("Guardian of Galaxy", 10.0, true);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(0.5, taxCalculation.calculateTaxFor(book));
    }

    @Test
    void this_will_return_total_tax_for_imported_other() {
        var otherProduct = new OtherProduct("Samsung 42 inch", 234.0, true);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(35.1, taxCalculation.calculateTaxFor(otherProduct));
    }
    
    @Test
    void this_will_return_total_tax_with_rounded_5_cents_for_imported_book() {
        var book = new Book("Java Programming", 100.0, true);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(5.00, taxCalculation.calculateTaxFor(book));
    }

    @Test
    void this_will_return_total_tax_with_rounded_5_cents_for_other() {
        var otherProduct = new OtherProduct("Wireless Mouse", 10.1, false);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(1.05, taxCalculation.calculateTaxFor(otherProduct));
    }

    @Test
    void this_will_return_total_tax_for_non_imported_book() {
        var book = new Book("Java Programming for Beginner", 12.49, false);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(0.0, taxCalculation.calculateTaxFor(book));
    }

}
