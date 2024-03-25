package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeometricShapeTest {

    @Test
    void this_will_return_area_of_rectangle() {
        Rectangle rectangle = new Rectangle(2.0, 6.0);
        Assertions.assertEquals(12.0, rectangle.getArea());

    }

    @Test
    void this_will_return_perimeter_of_rectangle() {
        Rectangle rectangle = new Rectangle(2.0, 6.0);
        Assertions.assertEquals(16.0, rectangle.getPerimeter());

    }

    @Test
    void this_will_return_perimeter_of_triangle() {
        Triangle triangle = new Triangle(3.0);
        Assertions.assertEquals(9.0, triangle.getPerimeter());

    }

    @Test
    void this_will_return_area_of_triangle() {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        Assertions.assertEquals(12.0, triangle.getArea());

    }

}
