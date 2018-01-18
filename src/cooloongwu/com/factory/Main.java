package cooloongwu.com.factory;

public class Main {
    public static void main(String[] args) {

        //针对顾客本身实现，顾客定制披萨
        PizzaStore nyStore = new NYPizzaStore();
        Pizza nyPizza = nyStore.orderPizza("cheese");
        System.out.println("a " + nyPizza.getName());

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza chicagoPizza = chicagoStore.orderPizza("cheese");
        System.out.println("a " + chicagoPizza.getName());
    }
}
