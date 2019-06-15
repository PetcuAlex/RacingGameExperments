package org.Alex;

import java.util.Scanner;

public class Vehicle {


    String name;
    String model;
    String colour;
    double fuelLevel;
    int manufactureYear;
    double mileage;
    double traveledDistance;
    double maxSpeed;
    double currentSpeed;
    boolean engineState;


    public double accelerate() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter accelartion speed:");
        double speed = in.nextDouble();
        System.out.println("Enter duration of acceleration:");
        double duration = in.nextDouble();


        System.out.println(name + " is accelerating with " + speed + "km/h for " + duration + " h.");
        double distance = speed * duration;
        System.out.println("Traveled distance " + distance + " km.");
        traveledDistance += distance;
        System.out.println("Total traveled distance is: " + traveledDistance + " km.");
        double spentFuel = distance / 100 * mileage;
        System.out.println("Spent fuel: " + spentFuel + " l.");
        fuelLevel -= spentFuel;
        System.out.println("Fuel level: " + fuelLevel + " l.");
        currentSpeed = speed;
        System.out.println("Your current speed is: " + currentSpeed);


        return distance;
    }

    public void stop() {

        System.out.println("Car is braking ");

        do {

            if (currentSpeed >= 20) {
                currentSpeed -= 20;
                System.out.println("Your current speed is " + currentSpeed);
            } else currentSpeed -= 1;
        }
        while (currentSpeed != 0);
        engineState = false;

        System.out.println("Your car is stopped");

    }


    public void start() {


        engineState = true;
        System.out.println("Your engine is started");
        accelerate();

    }


    public void brake() {

        double breaking;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter breaking speed: ");
            breaking = in.nextInt();
            System.out.println("breaking speed: " + breaking );
        }
        while (breaking == 0 || breaking > currentSpeed);
        System.out.println("Car is breaking...");
        currentSpeed -= breaking;
        System.out.println("Your current speed is: " + currentSpeed + " km/h.");


    }
}




