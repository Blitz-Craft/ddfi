package org.example;

public class Triangle implements Shape{

    private final double side1;
    private final double side2;
    private final double side3;


    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }


    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(s * (s-this.side1) * (s-this.side2) * (s-this.side3));
    }

    public String draw() {
        String dimension = "this is triangle with dimension : "+this.side1+" + "+this.side2+" + "+this.side3;
        String area = "this is triangle with area : "+this.getArea();
        String perimeter = "this is triangle with perimeter : "+this.getPerimeter();
        return dimension + "\n" + area + "\n" + perimeter;
    }


    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.0,4.0,5.0);
        System.out.println(triangle.draw());
    }
    // add comment try tp push
    // try to push
}