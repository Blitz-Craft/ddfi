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

}