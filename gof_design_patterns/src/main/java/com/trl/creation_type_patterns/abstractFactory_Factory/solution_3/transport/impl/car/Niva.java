package com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.transport.impl.car;

import com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.transport.interfaces.Car;

public class Niva implements Car {

    @Override
    public void drive() {
        System.out.println("Drive Niva");
    }

    @Override
    public void stop() {
        System.out.println("Stop Niva");
    }
}
