package org.example;

public abstract class Vehicle implements Accelerate{
    int id;
    String name;
    int velocity;

    public Vehicle(int id, String name, int velocity) {
        this.id = id;
        this.name = name;
        this.velocity = velocity;
    }
}
