package com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.factory.impl;

import com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.factory.interfaces.TransportFactory;
import com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.transport.impl.aircraft.TU134;
import com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.transport.impl.car.Niva;
import com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.transport.interfaces.Aircraft;
import com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.transport.interfaces.Car;

public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
