package com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.factory.impl;

import com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.factory.interfaces.TransportFactory;
import com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.transport.impl.aircraft.Boing747;
import com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.transport.impl.car.Porsche;
import com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.transport.interfaces.Aircraft;
import com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.transport.interfaces.Car;

public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boing747();
    }
}
