package cooloongwu.com.factory;

public class ChicagoStyleCheesePizza extends Pizza {

    PizzaIngredientFactory factory;

    public ChicagoStyleCheesePizza(PizzaIngredientFactory factory) {
        name = "Chicago Style Deep Dish Cheese Pizza";
        this.factory = factory;
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void prepare() {
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza int square slices");
    }
}
