package com.trl.structure_type_patterns.proxy_surrogate.solution_1;

public class Wizard {

    private final String name;

    public Wizard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
