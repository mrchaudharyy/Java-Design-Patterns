package com.mic.java.CreationalDesignPatterns.AbstractFactory;

public class HondaBike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding HondaBike");
    }
}
