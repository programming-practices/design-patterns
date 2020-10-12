package headfirst.myCode.strategy.puzzleSolution.a1;

public class King extends PersonageWhoCanFight {

    public King(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void fight() {
        System.out.println("King fight with " + weaponBehavior.useWeapon());
    }
}
