package com.qa.garage_task;

public class Car extends Vehicle {

    String type = "Car";

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", numOfWheels=" + numOfWheels +
                ", colour='" + colour + '\'' +
                '}';
    }
}
