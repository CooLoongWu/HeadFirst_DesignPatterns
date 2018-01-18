package cooloongwu.com.factory;

public abstract class PizzaStore {

    /**
     * 从Pizza类中直接搬过来的，然后使用工厂创建披萨
     *
     * @param type 披萨类型
     * @return 披萨
     */
    final public Pizza orderPizza(String type) {
        Pizza pizza;

//        if (type.equals("cheese")) {
//            pizza = new Pizza();
//        } else if (type.equals("pepperoni")) {
//            pizza = new Pizza();
//        } else if (type.equals("clam")) {
//            pizza = new Pizza();
//        } else {
//            pizza = new Pizza();
//        }

        /**
         * 利用工厂模式创建披萨
         */
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
