package com.mic.java.CreationalDesignPatterns.Singleton;

public class Singleton {

    private static volatile Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) { // Single Checked
            synchronized (Singleton.class) {
                if (instance == null) { // Double Checked
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

/*
Line number 12 -> If an instance was already created, don't do anything - avoid locking threads

Line number 14 -> The first thread that has acquired the lock checks and sees that there is no such object and creates it.
It releases the lock and the second one can do the same - it has to check if the object exists because the first one may have created it.

For example, if thread A and thread B reaches on line 13 then at that time only single thread let's say thread A will access the lock but thread B will
be waiting to acquire lock, once thread A releases the lock, thread B can create the instance (which breaks the principle).

To avoid such condition we use double locking.

So basically the outer if is used to prevent redundant locks - it lets all thread know that there is already an object and they don't need to lock/do anything.
And the inner if is used to let a concurrent thread know whether another thread has already created the object or not.
*/
