package de.tillmannheigel.examples.EnumInController.Enum;

public enum Vehicle {
    CAR("car"),
    TRAIN("train"),
    AIRCRAFT("plane"); //sometimes you just need to be a little more flexible...

    private String vehicle;

    Vehicle(String vehicle) {
        this.vehicle = vehicle;
    }
}
