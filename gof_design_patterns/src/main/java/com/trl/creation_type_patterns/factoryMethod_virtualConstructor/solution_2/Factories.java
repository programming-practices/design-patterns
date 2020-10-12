package com.trl.creation_type_patterns.factoryMethod_virtualConstructor.solution_2;

public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        // Realizacii polnosty vzaimozaminimu:
        serviceConsumer(Implementation2.factory);
    }
}
