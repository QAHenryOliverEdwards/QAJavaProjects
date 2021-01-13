package com.qa.garage_task;

public class Plane extends Vehicle {

    String type = "Plane";

    @Override
    public String toString() {
        return "Plane{" +
                "type='" + type + '\'' +
                ", numOfWheels=" + numOfWheels +
                ", colour='" + colour + '\'' +
                '}';
    }
}
