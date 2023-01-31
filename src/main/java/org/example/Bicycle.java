package org.example;

public class Bicycle extends Vehicle implements Accelerate {

    @Override
    public String toString() {
        return "Bicycle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", velocity=" + velocity +
                "} " + super.toString();
    }

    public Bicycle(int id, String name, int velocity) {
        super(id, name, velocity);
    }

    public int getVelocity() {
        return velocity;
    }

    @Override
    public int accelerate(int kmh) {
        if (getVelocity()+kmh >= 35)  {
            velocity = 35;
            return 35;
        }

        velocity+=kmh;
        return velocity;
    }

    @Override
    public int brake() {
        velocity = 0;
        return velocity;
    }


}
