package cooloongwu.com.strategy;

/**
 * 绿头鸭
 */
public class MallardDuck extends Duck {

    /**
     * 不对具体实现编程，所以这里不要在构造器中制造一个具体的FlyWithWings实现类的实例
     * <p>
     * 我们在超类中使用setXXX()来设定一个具体的行为
     */
    public MallardDuck() {
        //flyBehavior = new FlyWithWings();
    }

//    @Override
//    void display() {
//        System.out.println("MallardDuck-display");
//    }
}
