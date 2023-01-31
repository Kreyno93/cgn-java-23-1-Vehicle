package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void accelerate() {
        //GIVEN
        Car testCar = new Car(1, "bike", 0);

        //WHEN
        int actual = testCar.accelerate(10);

        //THEN
        assertEquals(10, actual);
        assertEquals(10, testCar.getVelocity());
    }

    @Test
    void brake() {
        //GIVEN
        Car testCar = new Car(1,"bike",0);
        //WHEN
        int actual = testCar.brake();
        //THEN
        assertEquals(0,actual);
        assertEquals(0, testCar.getVelocity());
    }
}
