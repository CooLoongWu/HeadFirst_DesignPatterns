package cooloongwu.com.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 服务员类，打印菜单
 */
public class Waitress {

    ArrayList menus;
    MenuComponent allMenus;

    private Menu dinerMenu;
    private Menu cafeMenu;
    private Menu pancakeHouseMenu;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }


    public Waitress(ArrayList menus) {
        this.menus = menus;
    }


    public Waitress(Menu dinerMenu,
                    Menu cafeMenu,
                    Menu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
//        Iterator dinerIterator = dinerMenu.createIterator();
//        Iterator cafeIterator = cafeMenu.createIterator();
//        Iterator pancakeHouseIterator = pancakeHouseMenu.createIterator();
//
//        System.out.println("MENU\n");
//        System.out.println("CAFE\n");
//        printMenu(cafeIterator);
//        System.out.println("DINER\n");
//        printMenu(dinerIterator);
//        System.out.println("PANCAKE\n");
//        printMenu(pancakeHouseIterator);

//        Iterator iterator = menus.iterator();
//        while (iterator.hasNext()) {
//            Menu menu = (Menu) iterator.next();
//            printMenu(menu.createIterator());
//        }

        allMenus.print();
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

    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("VEGETARIAN MENU");

        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();

            try {
                //Menu会抛出一个异常，因为Menu不支持这个操作。
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
                //e.printStackTrace();
            }

        }
    }
}
