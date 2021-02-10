package com.mic.java.designpatterns.Creational.AbstractFactory;

public class HeroBike implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Riding HeroBike");
    }
}
