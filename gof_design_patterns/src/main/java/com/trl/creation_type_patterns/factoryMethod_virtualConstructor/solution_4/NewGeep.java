package com.trl.creation_type_patterns.factoryMethod_virtualConstructor.solution_4;

public class NewGeep extends Geep {

    @Override
    public void drive() {
        System.out.println("Drive NewGeep");
    }

    @Override
    public void stop() {
        System.out.println("Stop NewGeep");
    }


    public void newFunction() {
        System.out.println("NewGeep new function work");
    }
}
