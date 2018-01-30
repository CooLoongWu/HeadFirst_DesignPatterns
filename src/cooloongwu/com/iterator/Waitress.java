package cooloongwu.com.iterator;

import java.util.Iterator;

/**
 * 服务员类，打印菜单
 */
public class Waitress {

    private Menu dinerMenu;
    private Menu cafeMenu;
    private Menu pancakeHouseMenu;

    public Waitress(Menu dinerMenu,
                    Menu cafeMenu,
                    Menu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        Iterator pancakeHouseIterator = pancakeHouseMenu.createIterator();

        System.out.println("MENU\n");
        System.out.println("CAFE\n");
        printMenu(cafeIterator);
        System.out.println("DINER\n");
        printMenu(dinerIterator);
        System.out.println("PANCAKE\n");
        printMenu(pancakeHouseIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");

            System.out.println("=========================");
        }
    }
}
