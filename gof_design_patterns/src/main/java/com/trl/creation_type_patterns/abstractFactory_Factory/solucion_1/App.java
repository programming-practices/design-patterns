package com.trl.creation_type_patterns.abstractFactory_Factory.solucion_1;

public class App {

    private King king;
    private Castle castle;
    private Army army;

    /**
     * Creates kingdom
     */
    public void createKingdom(final KingdomFactory factory) {
        setKing(factory.createKing());
        setCastle(factory.createCastle());
        setArmy(factory.createArmy());
    }

    King getKing(final KingdomFactory factory) {
        return factory.createKing();
    }

    public King getKing() {
        return king;
    }

    private void setKing(final King king) {
        this.king = king;
    }

    Castle getCastle(final KingdomFactory factory) {
        return factory.createCastle();
    }

    public Castle getCastle() {
        return castle;
    }

    private void setCastle(final Castle castle) {
        this.castle = castle;
    }

    Army getArmy(final KingdomFactory factory) {
        return factory.createArmy();
    }

    public Army getArmy() {
        return army;
    }

    private void setArmy(final Army army) {
        this.army = army;
    }

    /**
     * The factory of kingdom factories.
     */
    public static class FactoryMaker {

        /**
         * The factory method to create KingdomFactory concrete objects.
         */
        public static KingdomFactory makeFactory(KingdomType type) {
            switch (type) {
                case ELF:
                    return new ElfKingdomFactory();
                case ORC:
                    return new OrcKingdomFactory();
                default:
                    throw new IllegalArgumentException("KingdomType not supported.");
            }
        }

        /**
         * Enumeration for the different types of Kingdoms.
         */
        public enum KingdomType {
            ELF, ORC
        }
    }
}