package com.trl.creation_type_patterns.singleton;

public class ExampleSingletonEarly {
    private static final ExampleSingletonEarly ourInstance = new ExampleSingletonEarly();

    private ExampleSingletonEarly() {
    }

    public static ExampleSingletonEarly getInstance() {
        return ourInstance;
    }
}
