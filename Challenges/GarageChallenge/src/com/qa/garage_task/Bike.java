package com.qa.garage_task;

public class Bike extends Vehicle {

    String type = "Bike";

    @Override
    public String toString() {
        return "Bike{" +
                "type='" + type + '\'' +
                ", numOfWheels=" + numOfWheels +
                ", colour='" + colour + '\'' +
                '}';
    }
}
