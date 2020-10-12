package com.trl.open_closed_principle.poorly_written_program;

public class Test {
    public static void main(String[] args) {

        Toyota toyota = new Toyota();
        Celica celica = new Celica();

        Taxi.workTaxi(toyota);
        Taxi.workTaxi(celica);
    }
}
