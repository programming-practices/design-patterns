package com.trl.creation_type_patterns.factoryMethod_virtualConstructor.solution_1;

public abstract class ShapeFactory {

    public static GeometricShape getShape(ShapeType name) {

        GeometricShape shape = null;

        switch (name) {
            case LINE:
                shape = new Line();
                break;
            case CIRCLE:
                shape = new Circle();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
        }
        return shape;
    }

}
