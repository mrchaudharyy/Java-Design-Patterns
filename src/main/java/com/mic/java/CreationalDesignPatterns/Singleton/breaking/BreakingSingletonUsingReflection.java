package com.mic.java.CreationalDesignPatterns.Singleton.breaking;

import com.mic.java.CreationalDesignPatterns.Singleton.Singleton;

import java.lang.reflect.Constructor;

public class BreakingSingletonUsingReflection {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = null;
        try {
            Constructor[] constructors = Singleton.class.getDeclaredConstructors();
            for (Constructor cons : constructors) {
                cons.setAccessible(true);
                instance2 = (Singleton) cons.newInstance();
                break;
            }
        } catch (Exception e) {
            e.getStackTrace();
        }

        System.out.println(instance1);
        System.out.println(instance2);
    }
}
