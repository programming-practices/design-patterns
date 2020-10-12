package com.trl.open_closed_principle.a_well_written_pragram;

public class Celica extends Toyota {

    public void pasanger(){

        System.out.println("Pasanger");
    }

    @Override
    public void carWorkInTaxi() {
        pasanger();
    }
}
