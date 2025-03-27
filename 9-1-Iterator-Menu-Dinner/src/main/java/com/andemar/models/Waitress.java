package com.andemar.models;

import java.util.Iterator;

public class Waitress {
  private final Menu pancakeHouseMenu;
  private final Menu dinerMenu;

  public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu() {
    System.out.println("MENU\n----\nBREAKFAST");
    printMenu(pancakeHouseMenu.createIterator());
    System.out.println("\nLUNCH");
    printMenu(dinerMenu.createIterator());
  }

  private void printMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem next = iterator.next();
      System.out.println(next.getName() + " ");
      System.out.println(next.getPrice() + " ");
      System.out.println(next.getDescription());
    }
  }

}
