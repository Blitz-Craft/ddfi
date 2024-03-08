package org.example;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ShoppingChart {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    private List<Product> products = new ArrayList<>();

    public void add(Product product){
        products.add(product);
    }

    public void printTicket(){

        var taxCalc = new TaxCalculator();
        var totalPayment = 0.0;
        var amountWithoutTax = 0.0;
        var priceWithTax = 0.0;
        for (Product product : products) {
            priceWithTax = taxCalc.calculateTaxFor(product) + product.getPrice();
            totalPayment += taxCalc.calculateTaxFor(product) + product.getPrice();
            amountWithoutTax += product.getPrice();

            System.out.print(product.getName() + " : ");
            System.out.println(df.format(priceWithTax));

        }
        var amountOfTaxes = totalPayment - amountWithoutTax;
        System.out.println("Amount of Taxes : "+ df.format(amountOfTaxes));
        System.out.println("Total : "+ df.format(totalPayment));
    }

    public static void main(String[] args) {
        var shoppingChart = new ShoppingChart();
        shoppingChart.add(new Product("Java Programming for Beginner", 12.49, false, Product.Type.BOOK));
        shoppingChart.add(new Product("Music Instrument", 14.99, false, Product.Type.OTHER));
        var product3 = new Product("Chocolate", 0.85, false, Product.Type.FOOD);
        shoppingChart.add(product3);

        shoppingChart.printTicket();
    }

}
