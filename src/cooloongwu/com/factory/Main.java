package cooloongwu.com.factory;

public class Main {
    public static void main(String[] args) {

        SimplePizzaFactory factory = new SimplePizzaFactory();

        Pizza pizza = new NYPizzaStore(factory).orderPizza("cheese");

    }
}
