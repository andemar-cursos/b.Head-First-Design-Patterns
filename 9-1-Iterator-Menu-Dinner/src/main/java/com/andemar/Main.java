package com.andemar;

import com.andemar.models.DinerMenu;
import com.andemar.models.PancakeHouseMenu;
import com.andemar.models.iterator.Waitress;
import com.andemar.models.iterator.WaitressWithOutIterator;

public class Main {

  public static void main(String[] args) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();

    System.out.println("-------------------------------------------------");
    System.out.println("WAITRESS WITHOUT ITERATOR");
    WaitressWithOutIterator waitressWithOut = new WaitressWithOutIterator(pancakeHouseMenu, dinerMenu);

    waitressWithOut.printMenu();
    //-----------------------------------
    System.out.println("-------------------------------------------------");
    System.out.println("WAITRESS WITH ITERATOR");

    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
    waitress.printMenu();
  }
}