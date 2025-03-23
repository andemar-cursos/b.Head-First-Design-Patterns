package com.andemar.models;

import com.andemar.models.iterator.DinerMenuIterator;
import com.andemar.models.iterator.Iterator;

public class DinerMenu {
  private static final int MAX_ITEMS = 6;
  private int numberOfItems = 0;
  private final MenuItem[] menuItems;

  public DinerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];

    addItem("Vegetarian BLT", "(Fakin' Bacon with lettuce & tomato on whole wheat)", true, 2.99);
    addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
    addItem("Soup of the day", "Soup of the day, with a side of potato saldas", false, 3.99);
    addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
  }

  public void addItem(String name, String description, boolean vegetarian, double price) {
    if (numberOfItems >= MAX_ITEMS) {
      System.out.println("Sorry, menu is full! Can't add item to menu");
    } else {
      menuItems[numberOfItems] = new MenuItem(name, description, vegetarian, price);
      numberOfItems++;
    }
  }

  // Using iterator this will be deleted or not used
  public MenuItem[] getMenuItems() {
    return menuItems;
  }

  public Iterator getIterator() {
    return new DinerMenuIterator(menuItems);
  }
}
