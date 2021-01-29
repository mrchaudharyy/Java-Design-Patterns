package com.mic.java.CreationalDesignPatterns.Singleton.breaking;

public class BreakingSingletonUsingCloning {

    public static void main(String[] args) throws CloneNotSupportedException {
        SingletonClass instance1 = SingletonClass.getInstance();
        SingletonClass instance2 = (SingletonClass) instance1.clone();

        System.out.println(instance1);
        System.out.println(instance2);
    }
}

class Cloning implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class SingletonClass extends Cloning {

    private static volatile SingletonClass instance = null;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (instance == null) { // Single Checked
            synchronized (SingletonClass.class) {
                if (instance == null) { // Double Checked
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }
}