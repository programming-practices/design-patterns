package com.trl.structure_type_patterns.decorator_wrapper.solution_1.objects;

public class TextView implements Component {
    @Override
    public void draw() {
        System.out.println("Draw TextView");
    }
}
