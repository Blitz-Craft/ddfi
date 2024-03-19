package org.example;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void printTicket() {

        var taxCalc = new PriceCalculator();
        var totalPayment = 0.0;
        var amountWithoutTax = 0.0;
        var priceWithTax = 0.0;
        for (Product product : products) {
            priceWithTax = taxCalc.calculatePriceFor(product) + product.getPrice();
            totalPayment += taxCalc.calculatePriceFor(product) + product.getPrice();
            amountWithoutTax += product.getPrice();

            System.out.print(product.getName() + " : ");
            System.out.println(df.format(priceWithTax));

        }
        var amountOfTaxes = totalPayment - amountWithoutTax;
        System.out.println("Amount of Taxes : " + df.format(amountOfTaxes));
        System.out.println("Total : " + df.format(totalPayment));
    }

    public static void main(String[] args) {
        var shoppingChart = new ShoppingCart();
        shoppingChart.add(new Book("Java Programming for Beginner", 12.49, false));
        shoppingChart.add(new Product("Music Instrument", 14.99, false));
        var product3 = new Food("Chocolate", 0.85, false);
        shoppingChart.add(product3);


        shoppingChart.printTicket();
    }
}