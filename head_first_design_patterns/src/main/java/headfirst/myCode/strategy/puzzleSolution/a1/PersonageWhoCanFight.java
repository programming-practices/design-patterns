package headfirst.myCode.strategy.puzzleSolution.a1;

public abstract class PersonageWhoCanFight implements Personage {

    protected WeaponBehavior weaponBehavior;

    public PersonageWhoCanFight(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

}
