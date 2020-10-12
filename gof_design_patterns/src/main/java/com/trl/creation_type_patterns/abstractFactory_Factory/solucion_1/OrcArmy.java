package com.trl.creation_type_patterns.abstractFactory_Factory.solucion_1;

public class OrcArmy implements Army {

    static final String DESCRIPTION = "This is the Orc Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
