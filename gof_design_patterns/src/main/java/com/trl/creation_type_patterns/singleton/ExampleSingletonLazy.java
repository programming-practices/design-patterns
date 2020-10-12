package com.trl.creation_type_patterns.singleton;

public class ExampleSingletonLazy {
    private static ExampleSingletonLazy instance;

    private ExampleSingletonLazy() {
    }

    public static synchronized ExampleSingletonLazy getInstance() {
        if (instance == null) {
            instance = new ExampleSingletonLazy();
        }
        return instance;
    }
}
