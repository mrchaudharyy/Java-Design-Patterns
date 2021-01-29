package com.mic.java.CreationalDesignPatterns.Factory;

public class FactoryClientClass {

    public static void main(String[] args) {
        LaptopFactory factory = new LaptopFactory();
        Laptop dellLaptop = factory.getLaptop(LaptopEnum.DELL);
        Laptop hpLaptop = factory.getLaptop(LaptopEnum.HP);

        dellLaptop.laptopName();
        hpLaptop.laptopName();
    }
}
