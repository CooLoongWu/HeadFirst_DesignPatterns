package cooloongwu.com.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] menuItems = dinerMenu.getMenuItems();

//
//        for (int i = 0; i < breakfastItems.size(); i++) {
//            MenuItem menuItem = breakfastItems.get(i);
//
//            System.out.println(menuItem.getName() + " ");
//            System.out.println(menuItem.getPrice() + " ");
//            System.out.println(menuItem.getDescription() + " ");
//
//            System.out.println("=========================");
//
//        }
//
//        for (int i = 0; i < menuItems.length; i++) {
//            MenuItem menuItem = menuItems[i];
//
//            if (menuItem != null) {
//                System.out.println(menuItem.getName() + " ");
//                System.out.println(menuItem.getPrice() + " ");
//                System.out.println(menuItem.getDescription() + " ");
//
//                System.out.println("=========================");
//            }
//        }

        printMenu(pancakeHouseMenu.createIterator());
        printMenu(dinerMenu.createIterator());
    }

    private static void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");

            System.out.println("=========================");
        }
    }

}
