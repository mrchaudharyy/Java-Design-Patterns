package com.mic.java.designpatterns.Creational.Factory;

public class FactoryClientClass {

    public static void main(String[] args) {
        LaptopFactory factory = new LaptopFactory();
        Laptop dellLaptop = factory.getLaptop(LaptopEnum.DELL);
        Laptop hpLaptop = factory.getLaptop(LaptopEnum.HP);

        dellLaptop.laptopName();
        hpLaptop.laptopName();
    }
}
