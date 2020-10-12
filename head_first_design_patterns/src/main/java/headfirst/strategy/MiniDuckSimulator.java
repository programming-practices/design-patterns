package headfirst.strategy;

import static utils.PrintUtils.lineSeparator;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        lineSeparator(1);
        MallardDuck mallard = new MallardDuck();
        mallard.performQuack();

        lineSeparator(2);
        RubberDuck rubberDuckie = new RubberDuck();
        rubberDuckie.performQuack();

        lineSeparator(3);
        DecoyDuck decoy = new DecoyDuck();
        decoy.performQuack();

        lineSeparator(4);
        ModelDuck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
