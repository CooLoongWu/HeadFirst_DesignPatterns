package cooloongwu.com.iterator;

import java.util.Iterator;

public class MenuItem extends MenuComponent {

    String name;
    String description;
    boolean vegetarian;
    double price;

    /**
     * 菜单包含了名称，叙述，是否为素食，以及价格
     *
     * @param name        名称
     * @param description 叙述
     * @param vegetarian  是否为素食
     * @param price       价格
     */
    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.println("" + getName());
        if (isVegetarian()) {
            System.out.println("(V)");
        }
        System.out.println(getPrice());
        System.out.println(getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
