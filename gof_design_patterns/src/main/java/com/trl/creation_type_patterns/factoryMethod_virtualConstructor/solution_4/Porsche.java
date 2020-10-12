package com.trl.creation_type_patterns.factoryMethod_virtualConstructor.solution_4;

public class Porsche implements Car {

    @Override
    public void drive() {
        System.out.println("Drive Porsche");
    }

    @Override
    public void stop() {
        System.out.println("Stop Porsche");
    }
}
