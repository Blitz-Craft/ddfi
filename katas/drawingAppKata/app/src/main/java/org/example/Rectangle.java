package org.example;

public class Rectangle {
    Double width;
    Double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {

    }

    Double getArea(){
        return width * length;
    }
    Double getArea(Double width, Double length){
        return width * length;
    }

    public double getLength() {
        return this.length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }
}
