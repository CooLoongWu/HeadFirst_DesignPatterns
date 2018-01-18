package cooloongwu.com.decorator;

/**
 * 调料的抽象类，也就是装饰类
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * 所有调料装饰者必须实现
     *
     * @return 描述
     */
    public abstract String getDescription();
}
