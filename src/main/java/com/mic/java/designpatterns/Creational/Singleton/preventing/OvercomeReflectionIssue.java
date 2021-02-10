package com.mic.java.designpatterns.Creational.Singleton.preventing;

import java.lang.reflect.Constructor;

/***
 1. To overcome issue raised by reflection, enums are used because java ensures internally that enum value is instantiated only once.
 Since java Enums are globally accessible, they can be used for singletons.
 Its only drawback is that it does not allow lazy initialization.
 Also, enums don’t have any constructor so it is not possible for Reflection to utilize it.

 2. Easiest way to overcome the reflection issue is to throw exception from private constructor if instance already exists.
 */
public class OvercomeReflectionIssue {
    public static void main(String[] args) throws Exception {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = null;
        System.out.println(instance1);

        Constructor constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        instance2 = (Singleton) constructor.newInstance();

        System.out.println(instance2);
    }
}

class Singleton {
    private static volatile Singleton instance = null;

    private Singleton() {
        if (instance != null) { // throw exception if instance is not null
            throw new RuntimeException("Not Allowed");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
