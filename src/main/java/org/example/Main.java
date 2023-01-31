package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(1, "Ferrari", 20);
        Bicycle bicycle = new Bicycle(2, "Bianchi", 10);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which vehicle do you want to accelerate? Car or bicycle?");
        String chooseVehicle = scanner.nextLine();

        if (chooseVehicle.equals("car")) {
            System.out.println("What do you want to do? Accelerate or brake?");
            String action = scanner.nextLine();
            System.out.println("How much do you want to accelerate?");
            int kmh = scanner.nextInt();
            car.action(action, kmh);
            System.out.println(car.getVelocity());
        } else if (chooseVehicle.equals("bicycle")) {
            System.out.println("What do you want to do? Accelerate or brake?");
            String action = scanner.nextLine();
            System.out.println("How much do you want to accelerate?");
            int kmh = scanner.nextInt();
            bicycle.action(action, kmh);
            System.out.println(bicycle.getVelocity());
        }
        
    }
}