package com.qa.garage_task;

public class Runner {

    public static void main(String[] args) {

        Bike bike = new Bike();
        Car car = new Car();
        Plane plane = new Plane();

        bike.setColour("Red");
        car.setColour("Blue");
        plane.setColour("Violet");

        bike.setNumOfWheels(2);
        car.setNumOfWheels(4);
        plane.setNumOfWheels(0);

        System.out.println(bike);
        System.out.println(car);
        System.out.println(plane);

        Garage garage = new Garage();
        garage.addToList(bike);
        garage.addToList(car);
        garage.addToList(plane);

        System.out.println(garage);

    }
}
