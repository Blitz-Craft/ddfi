package org.example;

public class Rectangle {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //
    double getArea(){
        return width * length;
    }

    public double getLength() {
        return this.length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }
}