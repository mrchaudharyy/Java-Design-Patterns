package com.mic.java.CreationalDesignPatterns.AbstractFactory;

public class VehicleAbstractFactory {

    public static Automobile getVehicle(VehicleEnum vehicleType) {
        if (vehicleType == null) {
            return null;
        }

        switch (vehicleType) {
            case CAR:
                return new FourWheelerFactory();
            case BIKE:
                return new TwoWheelerFactory();
            default:
                return null;
        }

    }
}
