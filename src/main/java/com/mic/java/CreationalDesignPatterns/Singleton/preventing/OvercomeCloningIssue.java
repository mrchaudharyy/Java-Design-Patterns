package com.mic.java.CreationalDesignPatterns.Singleton.preventing;

public class OvercomeCloningIssue {

    public static void main(String[] args) throws CloneNotSupportedException {
        SingletonClass1 instance1 = SingletonClass1.getInstance();
        SingletonClass1 instance2 = (SingletonClass1) instance1.clone();
        // to overcome the clone issue we just have to override the clone method in our Singleton class.

        System.out.println(instance1);
        System.out.println(instance2);
    }
}

class Cloning1 implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class SingletonClass1 extends Cloning1 {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException(); // preventing from cloning.
    }

    private static volatile SingletonClass1 instance = null;

    private SingletonClass1() {
    }

    public static SingletonClass1 getInstance() {
        if (instance == null) { // Single Checked
            synchronized (SingletonClass1.class) {
                if (instance == null) { // Double Checked
                    instance = new SingletonClass1();
                }
            }
        }
        return instance;
    }
}
