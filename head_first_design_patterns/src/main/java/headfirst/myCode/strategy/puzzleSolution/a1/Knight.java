package headfirst.myCode.strategy.puzzleSolution.a1;

public class Knight extends PersonageWhoCanFight {

    public Knight(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void fight() {
        System.out.println("Knight fight with " + weaponBehavior.useWeapon());
    }
}
