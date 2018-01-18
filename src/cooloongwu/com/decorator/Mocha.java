package cooloongwu.com.decorator;

/**
 * 摩卡调料装饰类
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，Mocha";
    }

    /**
     * 要计算带摩卡饮料的价钱，首先把调用委托给被装饰者对象，以计算价钱，
     * 然后再加上摩卡的价钱。
     *
     * @return 带摩卡饮料的价钱
     */
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
