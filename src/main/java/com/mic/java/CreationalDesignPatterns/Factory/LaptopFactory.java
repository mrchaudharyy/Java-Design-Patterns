package com.mic.java.CreationalDesignPatterns.Factory;

public class LaptopFactory {

    public Laptop getLaptop(LaptopEnum laptopType) {

        if (laptopType == null) {
            return null;
        }
        switch (laptopType) {
            case DELL:
                return new DellLaptop();
            case HP:
                return new HpLaptop();
            default:
                return null;
        }
    }
}
