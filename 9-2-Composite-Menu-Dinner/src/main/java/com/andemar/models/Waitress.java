package com.andemar.models;

import com.andemar.models.composite.MenuComponent;
import java.util.Iterator;
import java.util.List;

public class Waitress {
  MenuComponent allMenus;

  public Waitress(MenuComponent allMenus) {
    this.allMenus = allMenus;
  }

  public void printMenu() {
    allMenus.print();
  }
}
