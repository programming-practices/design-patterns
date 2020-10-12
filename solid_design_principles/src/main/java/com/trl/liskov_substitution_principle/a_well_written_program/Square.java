package com.trl.liskov_substitution_principle.a_well_written_program;


public class Square implements Shape{

    private int wight;

    public Square(int wight) {
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "Square wight = " + wight + "\n" +
                "Square getSquare() = " + getSquare() + "\n";
    }

    @Override
    public int getSquare() {
        return  wight * wight;
    }

}
