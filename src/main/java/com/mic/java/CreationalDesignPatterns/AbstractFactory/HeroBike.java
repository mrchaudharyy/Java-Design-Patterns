package com.mic.java.CreationalDesignPatterns.AbstractFactory;

public class HeroBike implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Riding HeroBike");
    }
}
