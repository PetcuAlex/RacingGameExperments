package org.Alex;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Car car = new Car();
        car.name = "Ford";
        car.model = "Mustang";
        car.colour = "Blue";
        car.mileage = 12.4;
        car.doorsCount = 2;
        car.engineState = true;
        car.fuelLevel = 70;
        car.manufactureYear = 2019;
        car.maxSpeed = 300;
        car.traveledDistance = 10;

        Engine engine = new Engine();
        engine.manufacturer = "Ford Motor";
        engine.capacity = 5000;
        engine.horsePower = 400;
        car.engine = engine;


        System.out.println("Car details: ");
        System.out.println("Name: " + car.name);
        System.out.println("Model: " + car.model);
        System.out.println("Colour: " + car.colour);
        System.out.println("Mileage: " + car.mileage);
        System.out.println("Doors: " + car.doorsCount);
        System.out.println("Engine state: " + car.engineState);
        System.out.println("Fuel level: " + car.fuelLevel);
        System.out.println("Manufacture year: " + car.manufactureYear);
        System.out.println("Maximum speed: " + car.maxSpeed);
        System.out.println("Traveled distance: " + car.traveledDistance);
        System.out.println();

        System.out.println("Our engine: " + car.engine.manufacturer);
        System.out.println("Capacity: " + car.engine.capacity);
        System.out.println("Horsepower: " + car.engine.horsePower );
        System.out.println();


        Car car2 = new Car();
        car2.name = "BMW";
        car2.model = "Series 1";
        car2.colour = "Red";
        car2.mileage = 7.3;
        car2.doorsCount = 4;
        car2.engineState = false;
        car2.fuelLevel = 60;
        car2.manufactureYear = 2015;
        car2.maxSpeed = 260;
        car2.traveledDistance = 0;

        Engine engine2 = new Engine();
        engine.manufacturer = "BMW";
        engine.capacity = 1600;
        engine.horsePower = 200;
        car2.engine = engine;

        System.out.println("Car 2 details: ");
        System.out.println("Name: " + car2.name);
        System.out.println("Model: " + car2.model);
        System.out.println("Colour: " + car2.colour);
        System.out.println("Mileage: " + car2.mileage);
        System.out.println("Doors: " + car2.doorsCount);
        System.out.println("Engine state: " + car2.engineState);
        System.out.println("Fuel level: " + car2.fuelLevel);
        System.out.println("Manufacture year: " + car2.manufactureYear);
        System.out.println("Maximum speed: " + car2.maxSpeed);
        System.out.println("Traveled distance: " + car2.traveledDistance);
        System.out.println();

        System.out.println("Our engine: " + car2.engine.manufacturer);
        System.out.println("Capacity: " + car2.engine.capacity);
        System.out.println("Horsepower: " + car2.engine.horsePower );
        System.out.println();

        Car car3 = car2;
        Engine engine3 = engine2;

        System.out.println("Car 3 details: ");
        System.out.println("Name: " + car3.name);
        System.out.println("Model: " + car3.model);
        System.out.println("Colour: " + car3.colour);
        System.out.println("Mileage: " + car3.mileage);
        System.out.println("Doors: " + car3.doorsCount);
        System.out.println("Engine state: " + car3.engineState);
        System.out.println("Fuel level: " + car3.fuelLevel);
        System.out.println("Manufacture year: " + car3.manufactureYear);
        System.out.println("Maximum speed: " + car3.maxSpeed);
        System.out.println("Traveled distance: " + car3.traveledDistance);
        System.out.println();

        System.out.println("Our engine: " + car3.engine.manufacturer);
        System.out.println("Capacity: " + car3.engine.capacity);
        System.out.println("Horsepower: " + car3.engine.horsePower );


        double distance = car.accelerate();
        car.stop();
        car.start();
        car.brake();





    }
}
