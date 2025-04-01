package com.andemar.models;

import java.util.Iterator;
import java.util.List;

public class Waitress {
  private final List<Menu> menus;

  public Waitress(List<Menu> menus) {
    this.menus = menus;
  }

  public void printMenu() {
    menus.stream()
        .map(Menu::createIterator)
        .forEach(this::printMenu);
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
