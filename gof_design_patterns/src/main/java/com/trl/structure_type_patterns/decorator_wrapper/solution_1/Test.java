package com.trl.structure_type_patterns.decorator_wrapper.solution_1;

import com.trl.structure_type_patterns.decorator_wrapper.solution_1.decorators.BordeDecorator;
import com.trl.structure_type_patterns.decorator_wrapper.solution_1.decorators.ColorDecorator;
import com.trl.structure_type_patterns.decorator_wrapper.solution_1.objects.Component;
import com.trl.structure_type_patterns.decorator_wrapper.solution_1.objects.Window;

public class Test {
    public static void main(String[] args) {
        Component window = new Window();
        window.draw();
        System.out.println("-----------------");

        Component windowWithBorder = new BordeDecorator(new Window());
        windowWithBorder.draw();
        System.out.println("-----------------");

        Component windowWithColorAndBorder = new ColorDecorator(new BordeDecorator(new Window()));
        windowWithColorAndBorder.draw();
        System.out.println("-----------------");

        Component windowWithBorderAndColor = new BordeDecorator(new ColorDecorator(new Window()));
        windowWithBorderAndColor.draw();
    }
}
