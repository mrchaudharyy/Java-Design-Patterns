package com.mic.java.CreationalDesignPatterns.AbstractFactory;

public class AbstractFactoryClientClass {

    public static void main(String[] args) {
        Automobile twoWheelerFactory = VehicleAbstractFactory.getVehicle(VehicleEnum.BIKE);
        Vehicle twoWheelerVehicle = twoWheelerFactory.drive(AutomobileEnum.HERO);
        twoWheelerVehicle.drive();

        Automobile fourWheelerFactory = VehicleAbstractFactory.getVehicle(VehicleEnum.CAR);
        Vehicle fourWheelerVehicle = fourWheelerFactory.drive(AutomobileEnum.HYUNDAI);
        fourWheelerVehicle.drive();

    }
}
