package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    void calculate_area_of_circle(){
        Circle circle = new Circle(7.0);
        Assertions.assertEquals(153.93, circle.getArea(), 0.01);
    }

    @Test
    void calculate_perimater_or_circle(){
        Circle circle = new Circle(7.0);
        Assertions.assertEquals(43.98, circle.getPerimeter(), 0.01);
    }
}
