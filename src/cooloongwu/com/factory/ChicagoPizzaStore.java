package cooloongwu.com.factory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();

        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza(factory);
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStyleCheesePizza(factory);
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleCheesePizza(factory);
        } else {
            pizza = new ChicagoStyleCheesePizza(factory);
        }
        return pizza;
    }
}
