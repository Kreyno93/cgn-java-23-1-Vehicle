package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicycleTest {

    @Test
    void accelerate() {
        //GIVEN
        Bicycle testBicycle = new Bicycle(1, "bike", 0);

        //WHEN
        int actual = testBicycle.accelerate(10);

        //THEN
        assertEquals(10, actual);
        assertEquals(10, testBicycle.getVelocity());
    }

    @Test
    void accelerate_whenOver35_thenCapAt35() {
        //GIVEN
        Bicycle testBicycle = new Bicycle(1, "bike", 0);

        //WHEN
        int actual = testBicycle.accelerate(36);

        //THEN
        assertEquals(35, actual);
        assertEquals(35, testBicycle.getVelocity());
    }

    @Test
    void brake() {
        //GIVEN
        Bicycle testBicycle = new Bicycle(1,"bike",0);
        //WHEN
        int actual = testBicycle.brake();
        //THEN
        assertEquals(0,actual);
        assertEquals(0,testBicycle.getVelocity());
    }
}
