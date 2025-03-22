package com.andemar;

import com.andemar.models.Coffee;
import com.andemar.models.Tea;

public class Main {

  public static void main(String[] args) {
    Coffee coffee = new Coffee();
    System.out.println("\nMaking coffee...");
    coffee.prepareRecipe();

    Tea tea = new Tea();
    System.out.println("\nMaking tea...");
    tea.prepareRecipe();
  }
}