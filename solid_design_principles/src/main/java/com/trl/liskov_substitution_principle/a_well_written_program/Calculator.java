package com.trl.liskov_substitution_principle.a_well_written_program;

public class Calculator {

    public static int calculaSquare(Shape shape){
        return shape.getSquare();
    }

}
