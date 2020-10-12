package com.trl.creation_type_patterns.abstractFactory_Factory.solucion_1;

public class OrcKingdomFactory implements KingdomFactory {

    public Castle createCastle() {
        return new OrcCastle();
    }

    public King createKing() {
        return new OrcKing();
    }

    public Army createArmy() {
        return new OrcArmy();
    }

}
