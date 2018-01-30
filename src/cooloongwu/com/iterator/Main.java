package cooloongwu.com.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
//        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
////        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
//
//        DinerMenu dinerMenu = new DinerMenu();
////        MenuItem[] menuItems = dinerMenu.getMenuItems();
//
//        CafeMenu cafeMenu = new CafeMenu();
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

//        Waitress waitress = new Waitress(cafeMenu, dinerMenu, pancakeHouseMenu);
//        waitress.printMenu();
        test();
    }

    public static void test() {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "DINNER");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Vegetarian BLT",
                "(Fakin`) Bacon with lettuce & tomato on whole wheat",
                true,
                2.99));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                true,
                3.89
        ));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }

}
