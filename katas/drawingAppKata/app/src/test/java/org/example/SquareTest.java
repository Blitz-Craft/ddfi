package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {
    @Test
    void calculate_area_of_square(){
        Square square = new Square(5.0);
        Assertions.assertEquals(25.0, square.getArea());
    }

    @Test
    void calculate_perimeter_of_square(){
        Square square = new Square(5.0);
        Assertions.assertEquals(20.0, square.getPerimeter());
    }
}