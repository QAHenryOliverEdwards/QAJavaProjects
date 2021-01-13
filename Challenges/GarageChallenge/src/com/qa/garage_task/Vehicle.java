package com.qa.garage_task;

public abstract class Vehicle {

    protected int numOfWheels;
    protected String colour;

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numOfWheels=" + numOfWheels +
                ", colour='" + colour + '\'' +
                '}';
    }
}
