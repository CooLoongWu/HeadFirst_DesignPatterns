package cooloongwu.com.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu {

    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);

        addItem("Soup of the day",
                "A cup id the soup of the day, with a side salad",
                false, 3.69);
    }

    private void addItem(String name,
                         String des,
                         boolean vegetarian,
                         double price) {
        MenuItem menuItem = new MenuItem(name, des, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Hashtable getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
