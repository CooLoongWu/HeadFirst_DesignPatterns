package cooloongwu.com.decorator;

/**
 * 另一种咖啡饮料类
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
