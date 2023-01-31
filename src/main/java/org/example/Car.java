package org.example;

public class Car extends Vehicle implements Accelerate {


    @Override
    public int accelerate(int kmh) {
        velocity+=kmh;
        return velocity;
    }

    @Override
    public int brake() {
        velocity = 0;
        return velocity;
    }

    public int getVelocity() {
        return velocity;
    }

    public Car(int id, String name, int velocity) {
        super(id, name, velocity);
    }
}
