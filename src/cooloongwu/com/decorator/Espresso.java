package cooloongwu.com.decorator;

/**
 * 浓缩咖啡类，继承自饮料基类
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
