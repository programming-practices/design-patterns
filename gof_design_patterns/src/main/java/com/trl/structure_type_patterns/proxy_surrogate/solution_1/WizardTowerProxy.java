package com.trl.structure_type_patterns.proxy_surrogate.solution_1;

public class WizardTowerProxy implements WizardTower {

    private static final int NUM_WIZARDS_ALLOWED = 3;
    private final WizardTower tower;
    private int numWizards;

    public WizardTowerProxy(WizardTower tower) {
        this.tower = tower;
    }

    @Override
    public void enter(Wizard wizard) {
        if (numWizards < NUM_WIZARDS_ALLOWED) {
            tower.enter(wizard);
            numWizards++;
        } else {
            System.out.println("{} is not allowed to enter! " + wizard);
        }
    }
}
