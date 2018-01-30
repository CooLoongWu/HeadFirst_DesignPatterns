package cooloongwu.com.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {

    //abstract Iterator createIterator();

    ArrayList menuComponents = new ArrayList();

    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println(getDescription());

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }

        System.out.println("----------");
    }

    @Override
    public Iterator createIterator() {
        //这里使用一个新的迭代器，该迭代器知道如何遍历任何组合。
        return new CompositeIterator(menuComponents.iterator());
    }
}
