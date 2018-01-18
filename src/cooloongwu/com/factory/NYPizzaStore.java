package cooloongwu.com.factory;

public class NYPizzaStore extends PizzaStore {


    public NYPizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    @Override
    Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new Pizza();
            System.out.println("cheese pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new Pizza();
            System.out.println("pepperoni pizza");
        } else if (type.equals("clam")) {
            pizza = new Pizza();
            System.out.println("clam pizza");
        } else {
            pizza = new Pizza();
            System.out.println("default pizza");
        }
        return pizza;
    }
}
