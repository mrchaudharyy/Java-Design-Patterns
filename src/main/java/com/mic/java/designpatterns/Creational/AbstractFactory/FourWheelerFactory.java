package com.mic.java.designpatterns.Creational.AbstractFactory;

public class FourWheelerFactory implements Automobile {

    public Vehicle drive(AutomobileEnum carType) {
        if (carType == null) {
            return null;
        }

        switch (carType) {
            case MARUTI:
                return new MarutiCar();
            case HYUNDAI:
                return new HyundaiCar();
            default:
                return null;
        }
    }

}
