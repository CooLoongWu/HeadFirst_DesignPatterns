package cooloongwu.com.factory;

public class NYStyleCheesePizza extends Pizza {

    PizzaIngredientFactory factory;

    public NYStyleCheesePizza(PizzaIngredientFactory factory) {
        name = "NY Style Sauce and Cheese Pizza";
        this.factory = factory;
        toppings.add("Grated Reggiano Cheese");
    }

    /**
     * prepare()方法一步步的创建披萨，每当需要原料时就跟工厂要。
     */
    @Override
    void prepare() {
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }
}
