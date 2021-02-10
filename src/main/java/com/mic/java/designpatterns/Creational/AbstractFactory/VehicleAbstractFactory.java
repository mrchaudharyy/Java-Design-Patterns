package com.mic.java.designpatterns.Creational.AbstractFactory;

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
