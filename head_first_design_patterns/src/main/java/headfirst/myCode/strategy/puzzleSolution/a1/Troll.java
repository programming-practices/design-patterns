package headfirst.myCode.strategy.puzzleSolution.a1;

public class Troll extends PersonageWhoCanFight {

    public Troll(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void fight() {
        System.out.println("Troll fight with " + weaponBehavior.useWeapon());
    }
}
