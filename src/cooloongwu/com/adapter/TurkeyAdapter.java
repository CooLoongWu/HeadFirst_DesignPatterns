package cooloongwu.com.adapter;

/**
 * 假设我们缺少鸭子对象，想用一些火鸡对象来冒充。那么我们就需要写个适配器。
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
