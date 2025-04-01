package com.andemar;

import com.andemar.models.CafeMenu;
import com.andemar.models.DinerMenu;
import com.andemar.models.PancakeHouseMenu;
import com.andemar.models.Waitress;
import com.andemar.models.iterator.WaitressWithOutIterator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    CafeMenu cafeMenu = new CafeMenu();

    System.out.println("-------------------------------------------------");
    System.out.println("WAITRESS WITHOUT ITERATOR");
    WaitressWithOutIterator waitressWithOut = new WaitressWithOutIterator(pancakeHouseMenu, dinerMenu);

    waitressWithOut.printMenu();
    //-----------------------------------
    System.out.println("-------------------------------------------------");
    System.out.println("WAITRESS WITH ITERATOR");

    Waitress waitress = new Waitress(List.of(pancakeHouseMenu, dinerMenu, cafeMenu));
    waitress.printMenu();
  }
}