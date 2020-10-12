package com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.factory.interfaces;


import com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.transport.interfaces.Aircraft;
import com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.transport.interfaces.Car;

// fabrika po sozsaniy transportnux sredstv
public interface TransportFactory {

    // chto fabrika bydit proizvodit
    Car createCar();                // avtomobili

    Aircraft createAircraft();      // samolotu
}
