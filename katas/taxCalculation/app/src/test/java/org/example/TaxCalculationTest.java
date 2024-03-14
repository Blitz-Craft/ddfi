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
    void this_will_return_total_tax_for_luxury_book() {
        var book = new Book("Harry Potter Collectors Edition", 2000.0, false, true);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(200.0, taxCalculation.calculateTaxFor(book));
    }

    @Test
    void this_will_return_total_tax_for_food() {
        var food = new Food("Chicken", 4.0, false);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(0.0, taxCalculation.calculateTaxFor(food));
    }

    @Test
    void this_will_return_total_tax_for_luxury_food() {
        var food = new Food("Premium Chocolate", 40.0, false, true);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(4.0, taxCalculation.calculateTaxFor(food));
    }

    @Test
    void this_will_return_total_tax_for_medicine() {
        var medicine = new Medicine("Paracetamol", 2.0, false);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(0.0, taxCalculation.calculateTaxFor(medicine));
    }

    @Test
    void this_will_return_total_tax_for_luxury_medicine() {
        var medicine = new Medicine("Premium Herbal", 150.0, false, true);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(15.0, taxCalculation.calculateTaxFor(medicine));
    }

    @Test
    void this_will_return_total_tax_for_other_than_book_food_and_medicine() {
        var product = new Product("iPhone", 900.0, false);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(90.00, taxCalculation.calculateTaxFor(product));
    }

    @Test
    void this_will_return_total_tax_for_imported_book() {
        var book = new Book("Guardian of Galaxy", 10.0, true);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(0.5, taxCalculation.calculateTaxFor(book));
    }

    @Test
    void this_will_return_total_tax_for_imported_and_luxury_book() {
        var book = new Book("Guardian of Galaxy Premium", 100.0, true, true);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(15.0, taxCalculation.calculateTaxFor(book));
    }

    @Test
    void this_will_return_total_tax_for_imported_and_luxury_food() {
        var food = new Food("Chocolate Premium Imported", 100.0, true, true);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(15.0, taxCalculation.calculateTaxFor(food));
    }

    @Test
    void this_will_return_total_tax_for_imported_and_luxury_medicine() {
        var medicine = new Medicine("Herbal Premium Imported", 1000.0, true, true);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(150.0, taxCalculation.calculateTaxFor(medicine));
    }
    @Test
    void this_will_return_total_tax_for_imported_other() {
        var product = new Product("Samsung 42 inch", 234.0, true);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(35.1, taxCalculation.calculateTaxFor(product));
    }
    


    @Test
    void this_will_return_total_tax_for_non_imported_book() {
        var book = new Book("Java Programming for Beginner", 12.49, false);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(0.0, taxCalculation.calculateTaxFor(book));
    }

    @Test
    void this_will_return_total_tax_for_imported_and_luxury_for_other() {
        var product = new Product("Louis Vuitton", 1000.0, true, true);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(250.0, taxCalculation.calculateTaxFor(product));
    }

    @Test
    void this_will_return_total_tax_for_non_imported_and_luxury_for_other() {
        var product = new Product("ZARA", 1000.0, false, true);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(200.0, taxCalculation.calculateTaxFor(product));
    }

    @Test
    void this_will_return_total_tax_with_rounded_5_cents_for_imported_book() {
        var book = new Book("Java Programming", 100.0, true);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(5.00, taxCalculation.calculateTaxFor(book));
    }

    @Test
    void this_will_return_total_tax_with_rounded_5_cents_for_other() {
        var product = new Product("Wireless Mouse", 10.1, false);
        var taxCalculation = new TaxCalculator();
        Assertions.assertEquals(1.05, taxCalculation.calculateTaxFor(product));
    }

}
