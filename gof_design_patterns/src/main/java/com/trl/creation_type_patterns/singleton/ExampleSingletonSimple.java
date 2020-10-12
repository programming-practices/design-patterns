package com.trl.creation_type_patterns.singleton;

public class ExampleSingletonSimple {
}

// linivui com.trl.singleton
class SingletonA {
    private static SingletonA INSTANCE = null;

    private SingletonA() {
    }

    public static SingletonA getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new SingletonA();
        }
        return INSTANCE;
    }

}

// ne linivui com.trl.singleton
class SingletonB {
    private static SingletonB INSTANCE = new SingletonB();

    private SingletonB() {
    }

    public static SingletonB getInstance() {
        return INSTANCE;
    }
}