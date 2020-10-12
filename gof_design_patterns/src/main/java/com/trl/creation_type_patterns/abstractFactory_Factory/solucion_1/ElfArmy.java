package com.trl.creation_type_patterns.abstractFactory_Factory.solucion_1;

public class ElfArmy implements Army {

    static final String DESCRIPTION = "This is the Elven Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
