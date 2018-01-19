package cooloongwu.com.factory;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza(factory);
        } else if (type.equals("pepperoni")) {
            pizza = new NYStyleCheesePizza(factory);
        } else if (type.equals("clam")) {
            pizza = new NYStyleCheesePizza(factory);
        } else {
            pizza = new NYStyleCheesePizza(factory);
        }
        return pizza;
    }
}
