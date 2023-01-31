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

    public void action(String action, int kmh) {
        if (action.equals("accelerate")) {
            accelerate(kmh);
        } else if(action.equals("brake")) {
            brake(kmh);
        }
    }
    public Bicycle(int id, String name, int velocity) {
        super(id, name, velocity);
    }

    public int getVelocity() {
        return velocity;
    }

    @Override
    public int accelerate(int kmh) {
        return getVelocity()+kmh;
    }

    @Override
    public int brake(int kmh) {
        return 0;
    }


}
