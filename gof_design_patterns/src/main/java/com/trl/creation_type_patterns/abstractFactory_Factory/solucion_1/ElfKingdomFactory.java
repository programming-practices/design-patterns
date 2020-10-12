package com.trl.creation_type_patterns.abstractFactory_Factory.solucion_1;

public class ElfKingdomFactory implements KingdomFactory {

    public Castle createCastle() {
        return new ElfCastle();
    }

    public King createKing() {
        return new ElfKing();
    }

    public Army createArmy() {
        return new ElfArmy();
    }

}
