package com.trl.creation_type_patterns.abstractFactory_Factory.solution_2;

public /*abstract*/ interface AbstractFactory {
    default Color getColor(String color) {
        return null;
    }

    default Shape getShape(String shape) {
        return null;
    }
}
