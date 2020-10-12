package com.trl.creation_type_patterns.factoryMethod_virtualConstructor.solution_2;

public class Implementation2 implements Service {
    public static ServiceFactory factory =
            new ServiceFactory() {

                @Override
                public Service getService() {
                    return new Implementation2();
                }
            };

    private Implementation2() {
    }

    @Override
    public void method1() {
        System.out.println("Implementation2 metod1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2 metod2");
    }
}
