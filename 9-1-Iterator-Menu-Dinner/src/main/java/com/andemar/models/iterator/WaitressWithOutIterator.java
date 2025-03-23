package com.andemar.models.iterator;

import com.andemar.models.DinerMenu;
import com.andemar.models.MenuItem;
import com.andemar.models.PancakeHouseMenu;
import java.util.List;

public class WaitressWithOutIterator {
  private final PancakeHouseMenu pancakeHouseMenu;
  private final DinerMenu dinerMenu;

  public WaitressWithOutIterator(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu() {
    System.out.println("MENU\n----\nBREAKFAST");
    printBreakfastMenu();
    System.out.println("\nLUNCH");
    printLunchMenu();
  }

  private void printBreakfastMenu() {
    List<MenuItem> menuItems = pancakeHouseMenu.getMenuItems();

    for (int i = 0; i < menuItems.size(); i++) {
      MenuItem menuItem = menuItems.get(i);
      System.out.println(menuItem.getName() + " ");
      System.out.println(menuItem.getPrice() + " ");
      System.out.println(menuItem.getDescription());
      System.out.println("\n");
    }
  }

  private void printLunchMenu() {
    MenuItem[] menuItems = dinerMenu.getMenuItems();

    for (int i = 0; i < menuItems.length; i++) {
      MenuItem menuItem = menuItems[i];
      if(menuItem != null) {
        System.out.println(menuItem.getName() + " ");
        System.out.println(menuItem.getPrice() + " ");
        System.out.println(menuItem.getDescription());
        System.out.println("\n");
      }
    }
  }
}
