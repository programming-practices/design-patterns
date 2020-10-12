package com.trl.open_closed_principle.a_well_written_pragram;

public class Toyota implements Car{

    public void pasangers(){
        System.out.println("Pasangers");
    }

    @Override
    public void carWorkInTaxi() {
        pasangers();
    }
}
