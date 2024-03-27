package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {


    @Test
    void calculate_area_of_rectangle() {
        Rectangle rectangle = new Rectangle(2.0, 6.0);
        Assertions.assertEquals(12.0, rectangle.getArea());
//
    }

    @Test
    void calculate_perimeter_of_rectangle() {
        Rectangle rectangle = new Rectangle(2.0, 6.0);
        Assertions.assertEquals(16.0, rectangle.getPerimeter());
    }

    @Test
    void draw_the_rectangle() {
        Rectangle rectangle = new Rectangle(2.0, 6.0);
        Assertions.assertEquals("this is rectangle with dimension : 2.0 x 6.0\n" +
                "this is rectangle with area : 12.0\n" +
                "this is rectangle with perimeter : 16.0", rectangle.draw());
    }

}