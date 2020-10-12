package headfirst.myCode.strategy.puzzleSolution.a1;

public class Queen extends PersonageWhoCanFight {

    public Queen(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void fight() {
        System.out.println("Queen fight with " + weaponBehavior.useWeapon());
    }
}
