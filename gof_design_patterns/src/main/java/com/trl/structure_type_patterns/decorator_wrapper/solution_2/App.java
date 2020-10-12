package com.trl.structure_type_patterns.decorator_wrapper.solution_2;

public class App {

    public static void main(String[] args) {

        // simple troll
        System.out.println("A simple looking troll approaches.");
        Troll troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        System.out.println("Simple troll power {}.\n" + troll.getAttackPower());

        // change the behavior of the simple troll by adding a decorator
        System.out.println("A troll with huge club surprises you.");
        Troll clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        System.out.println("Clubbed troll power {}.\n" + clubbedTroll.getAttackPower());

    }

}
