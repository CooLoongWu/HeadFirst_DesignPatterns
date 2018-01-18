package cooloongwu.com.factory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleCheesePizza();
        } else {
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
