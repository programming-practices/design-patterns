package com.trl.creation_type_patterns.abstractFactory_Factory.solucion_1;

public class ElfKing implements King {

    static final String DESCRIPTION = "This is the Elven king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

}
