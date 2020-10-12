package headfirst.myCode.strategy.puzzleSolution.a1;

import static utils.PrintUtils.lineSeparator;

public class MiniFightingSimulator {
    public static void main(String[] args) {

        lineSeparator(1);
        PersonageWhoCanFight king = new King(new SwordBehavior());
        PersonageWhoCanFight troll = new Troll(new AxeBehavior());
        king.fight();
        troll.fight();
        king.setWeaponBehavior(new AxeBehavior());
        System.out.println();
        king.fight();
        troll.fight();

        lineSeparator(2);
        PersonageWhoCanFight queen = new Queen(new BowAndArrowBehavior());
        PersonageWhoCanFight troll_1 = new Troll(new AxeBehavior());
        queen.fight();
        troll_1.fight();
        queen.setWeaponBehavior(new SwordBehavior());
        System.out.println();
        queen.fight();
        troll_1.fight();

        lineSeparator(3);
        PersonageWhoCanFight knight = new Knight(new KnifeBehavior());
        PersonageWhoCanFight troll_2 = new Troll(new AxeBehavior());
        knight.fight();
        troll_2.fight();
        knight.setWeaponBehavior(new AxeBehavior());
        System.out.println();
        knight.fight();
        troll_2.fight();

    }
}
