package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void calculate_area_of_triangle() {
        Triangle triangle = new Triangle(3.0,4.0,5.0);
        Assertions.assertEquals(6.0, triangle.getArea());
//
    }

    @Test
    void calculate_perimeter_of_triangle(){
        Triangle triangle = new Triangle(3.0,4.0,5.0);
        Assertions.assertEquals(12.0, triangle.getPerimeter());
    }

    @Test
    void draw_the_triangle() {
        Triangle triangle = new Triangle(3.0,4.0,5.0);
        Assertions.assertEquals("this is triangle with dimension : 3.0 + 4.0 + 5.0\n" +
                "this is triangle with area : 6.0\n" +
                "this is triangle with perimeter : 12.0", triangle.draw());
    }

}