package com.andemar.models.iterator;

import com.andemar.models.DinerMenu;
import com.andemar.models.MenuItem;
import com.andemar.models.PancakeHouseMenu;
import java.util.List;

public class Waitress {
  private final PancakeHouseMenu pancakeHouseMenu;
  private final DinerMenu dinerMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu() {
    System.out.println("MENU\n----\nBREAKFAST");
    printMenu(pancakeHouseMenu.getIterator());
    System.out.println("\nLUNCH");
    printMenu(dinerMenu.getIterator());
  }

  private void printMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      MenuItem next = (MenuItem) iterator.next();
      System.out.println(next.getName() + " ");
      System.out.println(next.getPrice() + " ");
      System.out.println(next.getDescription());
    }
  }

}
