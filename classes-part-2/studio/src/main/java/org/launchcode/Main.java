package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        MenuItem tacos = new MenuItem(2.99, "tasty tacos", "mexican", true);
//        MenuItem fish = new MenuItem(8.99, "wild fish", "alaskan", false);
//        MenuItem burger = new MenuItem(5.99, "burger with extra cheese", "american", false);

        ArrayList<MenuItem> menuItems = new ArrayList<>(Arrays.asList(
                new MenuItem(2.99, "tasty tacos", "appetizer", true),
                new MenuItem(8.99, "wild fish", "main course", false),
                new MenuItem(5.99, "burger with extra cheese", "main course", false)
        ));

        Menu menu = new Menu(new Date(), menuItems);

        System.out.println("\nLast Update: " + menu.getLastUpdated());
        for (MenuItem menuItem : menu.getItems()) {
            String newString = menuItem.isNew() ? "New" : "";
            System.out.println(
                    menuItem.getDescription() + " : " +
                    menuItem.getCategory() + " $" +
                    menuItem.getPrice() + " " +
                    newString
            );
            if (menuItem.getDescription() == "burger with extra cheese"){
                menu.removeItem(menuItem);
                  break;
            }
        }
        System.out.println("");
        for (MenuItem menuItem : menu.getItems()) {
            System.out.println(
                    menuItem.getDescription() + " : " +
                            menuItem.getCategory() + " $" +
                            menuItem.getPrice()
            );
        }
    }
}
