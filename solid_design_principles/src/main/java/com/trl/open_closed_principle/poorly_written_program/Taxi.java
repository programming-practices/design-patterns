package com.trl.open_closed_principle.poorly_written_program;

public class Taxi {

    public static void workTaxi(Toyota toyota){

        if (toyota instanceof Celica){
            ((Celica) toyota).pasanger();
        } else {
            toyota.pasangers();
        }
    }
}
