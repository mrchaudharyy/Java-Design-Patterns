package com.mic.java.designpatterns.Creational.AbstractFactory;

public class HondaBike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding HondaBike");
    }
}
