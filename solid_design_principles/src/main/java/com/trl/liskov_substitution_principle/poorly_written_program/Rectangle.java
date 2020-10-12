package com.trl.liskov_substitution_principle.poorly_written_program;

public class Rectangle {

    private int wight;
    private int height;

    public Rectangle(int wight, int height) {
        this.wight = wight;
        this.height = height;
    }

    public int getSquare(){
        return wight * height;
    }

    @Override
    public String toString() {

        return "Rectangle wight = " + wight + " , height = " + height + "\n" +
                "Rectangle square() = " + getSquare() + "\n";

    }
}
