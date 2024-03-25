package org.example;

public class Triangle {

    private final double side1;
    private final double side2;
    private final double side3;


    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        //
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(s * (s-this.side1) * (s-this.side2) * (s-this.side3));
    }
}