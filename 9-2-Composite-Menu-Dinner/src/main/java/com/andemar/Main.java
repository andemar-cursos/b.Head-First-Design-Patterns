package com.andemar;

import com.andemar.models.Menu;
import com.andemar.models.MenuItem;
import com.andemar.models.Waitress;
import com.andemar.models.composite.MenuComponent;

public class Main {

  public static void main(String[] args) {
    MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
    MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
    MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
    MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");

    MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

    allMenus.add(pancakeHouseMenu);
    allMenus.add(dinerMenu);
    allMenus.add(cafeMenu);

    dinerMenu.add( new MenuItem("Pasta", "Spaghetti with Marinara sauce, and a slice of soudough bread", true, 3.89));

    dinerMenu.add(dessertMenu);

    dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59));

    Waitress waitress = new Waitress(allMenus);
    waitress.printMenu();
  }
}