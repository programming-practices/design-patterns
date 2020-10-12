package com.trl.structure_type_patterns.decorator_wrapper.solution_1.decorators;

import com.trl.structure_type_patterns.decorator_wrapper.solution_1.objects.Component;

public class ColorDecorator extends Decorator {

    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("... added color");
    }
}
