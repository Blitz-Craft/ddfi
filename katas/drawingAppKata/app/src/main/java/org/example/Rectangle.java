package org.example;

public class Rectangle implements Shape{
    protected final double width;
    protected final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    public double getArea(){
        return this.width * this.length;
    }

    public String draw() {
        String dimension = "this is rectangle with dimension : "+this.width+" x "+this.length;
        String area = "this is rectangle with area : "+this.getArea();
        String perimeter = "this is rectangle with perimeter : "+this.getPerimeter();
        return dimension + "\n" + area + "\n" + perimeter;
    }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.0,6.0);
        System.out.println(rectangle.draw());
    }

}