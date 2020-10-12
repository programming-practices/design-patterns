package com.trl.structure_type_patterns.proxy_surrogate.solution_1;

public class IvoryTower implements WizardTower {

    public void enter(Wizard wizard) {
        System.out.println("{} enters the tower. " + wizard);
    }

}
