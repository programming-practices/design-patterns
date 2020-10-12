package headfirst.myCode.strategy;

import headfirst.strategy.Duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new SimUDuck();
        duck.performQuack();
        duck.performFly();
        ((SimUDuck) duck).display();
    }
}
