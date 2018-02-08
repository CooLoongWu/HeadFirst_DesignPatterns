package cooloongwu.com.strategy;

/**
 * 一个鸭子游戏
 */
public class Main {

    public static void main(String[] args) {
//        new MallardDuck().display();
//        new RedheadDuck().display();
        Duck mallard = new MallardDuck();
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.performFly();

        Duck rubber = new RubberDuck();
        rubber.setFlyBehavior(new FlyNoWay());
        rubber.performFly();
    }
}
