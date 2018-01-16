package cooloongwu.com.welcome;

/**
 * 绿头鸭
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
    }

//    @Override
//    void display() {
//        System.out.println("MallardDuck-display");
//    }
}
