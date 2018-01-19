package cooloongwu.com.factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        System.out.println("createDough");
        return new Dough();
    }

    @Override
    public Sauce createSauce() {
        System.out.println("createSauce");
        return new Sauce();
    }

    @Override
    public Cheese createCheese() {
        System.out.println("createCheese");
        return new Cheese();
    }


}
