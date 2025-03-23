package com.andemar.models;

import com.andemar.models.iterator.Iterator;
import com.andemar.models.iterator.PancakeHouseMenuIterator;
import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
  List<MenuItem> menuItems;

  public PancakeHouseMenu() {
    this.menuItems = new ArrayList<>();

    addItem("KYB Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
    addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
    addItem("Blueberry Pancakes", "Panckes made with fresh blueberries", true, 3.49);
    addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
  }

  public void addItem(String name, String description, boolean vegetarian, double price) {
    this.menuItems.add(new MenuItem(name, description, vegetarian, price));
  }

  public List<MenuItem> getMenuItems() {
    return this.menuItems;
  }

  public Iterator getIterator() {
    return new PancakeHouseMenuIterator(menuItems);
  }
}
