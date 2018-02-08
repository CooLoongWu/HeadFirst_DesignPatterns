package cooloongwu.com.strategy;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("无法飞行");
    }
}
