package headfirst.myCode.strategy;

import headfirst.strategy.Duck;
import headfirst.strategy.FlyRocketPowered;
import headfirst.strategy.Quack;

public class SimUDuck extends Duck {

    public SimUDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyRocketPowered();
    }

    @Override
    public void display() {
        System.out.println("I'm a real SimUDuck duck");
    }

}
