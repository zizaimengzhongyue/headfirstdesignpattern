package strategy;

import strategy.duck.ModelDuck;
import strategy.fly.*;
import strategy.quack.*;

public class Main{
    public static void main(String[] args) {
       ModelDuck duck = new ModelDuck();

       FlyNoWay flyNoWay = new FlyNoWay();
       Quack quack = new Quack();
       duck.setFlyBehavior(flyNoWay);
       duck.setQuackBehavior(quack);
       duck.performFly();
       duck.performQuack();

       FlyWithWings flyWithWings = new FlyWithWings();
       Squack squack = new Squack();
       duck.setFlyBehavior(flyWithWings);
       duck.setQuackBehavior(squack);
       duck.performFly();
       duck.performQuack();
    }
}