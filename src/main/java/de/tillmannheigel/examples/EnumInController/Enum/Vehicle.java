package de.tillmannheigel.examples.EnumInController.Enum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Vehicle {
    CAR(Arrays.asList("audi", "bmw", "citroen")),
    TRAIN(Arrays.asList("velaro")),
    AIRCRAFT(Arrays.asList("airbus", "boeing")),
    DEFAULT_VEHICLE();

    private List<String> vehicles;

    Vehicle() {
        this.vehicles = Collections.emptyList();
    }

    Vehicle(List<String> vehicles) {
        this.vehicles = vehicles;
    }

    public static Vehicle fromValue(String vehicleName){
        for (Vehicle vehicle : Vehicle.values()) {
            if (vehicle.vehicles.contains(vehicleName)) {
                return vehicle;
            }
        }
        return DEFAULT_VEHICLE;
    }
}
