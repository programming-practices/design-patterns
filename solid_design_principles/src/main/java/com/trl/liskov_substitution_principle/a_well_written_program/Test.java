package com.trl.liskov_substitution_principle.a_well_written_program;


public class Test {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5,10);
        Square square = new Square(5);

        System.out.println(Calculator.calculaSquare(rectangle));
        System.out.println(Calculator.calculaSquare(square));

        System.out.println(rectangle.toString());
        System.out.println(square.toString());

    }
}
