package com.trl.liskov_substitution_principle.poorly_written_program;

public class Square extends Rectangle{

    public Square(int wight, int height) {
        super(wight, height);
    }

    @Override
    public int getSquare() {
        return super.getSquare();
    }
}
