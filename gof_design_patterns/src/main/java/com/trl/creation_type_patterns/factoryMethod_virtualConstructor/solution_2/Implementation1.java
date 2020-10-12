package com.trl.creation_type_patterns.factoryMethod_virtualConstructor.solution_2;


public class Implementation1 implements Service {
    public static ServiceFactory factory =
            new ServiceFactory() {

                @Override
                public Service getService() {
                    return new Implementation1();
                }
            };

    private Implementation1() {
    }

    @Override
    public void method1() {
        System.out.println("Implementation1 metod1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1 metod2");
    }
}
