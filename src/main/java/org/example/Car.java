package org.example;

public class Car extends Vehicle implements Accelerate {


    public void action(String action, int kmh) {
        if (action.equals("accelerate")) {
            accelerate(kmh);
        } else if(action.equals("brake")) {
            brake(kmh);
        }
        }

        @Override
        public int accelerate (int kmh){
            return getVelocity() + kmh;
        }

        @Override
        public int brake ( int kmh){
            return 0;
        }

        public int getVelocity () {
            return velocity;
        }

    public Car( int id, String name,int velocity){
            super(id, name, velocity);
        }
    }
