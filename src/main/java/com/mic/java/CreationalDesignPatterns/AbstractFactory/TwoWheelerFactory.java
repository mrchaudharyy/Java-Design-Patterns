package com.mic.java.CreationalDesignPatterns.AbstractFactory;

public class TwoWheelerFactory implements Automobile {

    @Override
    public Vehicle drive(AutomobileEnum bikeType) {
        if (bikeType == null) {
            return null;
        }

        switch (bikeType) {
            case HERO:
                return new HeroBike();
            case HONDA:
                return new HondaBike();
            default:
                return null;
        }
    }
}
