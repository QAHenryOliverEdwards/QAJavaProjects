package com.qa.garage_task;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Vehicle> listOfVehicles = new ArrayList<>();

    public void addToList(Vehicle vehicle) {
        listOfVehicles.add(vehicle);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "listOfVehicles=" + listOfVehicles +
                '}';
    }
}
