package com.andemar;

import com.andemar.models.BaseSingleton;
import com.andemar.models.DoubleCheckSingleton;
import com.andemar.models.EnumSingleton;
import com.andemar.models.RatherSingleton;
import com.andemar.models.SynchronizedSingleton;

public class Main {

  public static void main(String[] args) {
    BaseSingleton baseSingleton = BaseSingleton.getInstance();
    System.out.println(baseSingleton.toString());

    SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
    System.out.println(synchronizedSingleton.toString());

    RatherSingleton ratherSingleton = RatherSingleton.getInstance();
    System.out.println(ratherSingleton.toString());

    DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
    System.out.println(doubleCheckSingleton.toString());

    EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
    System.out.println(enumSingleton);
  }
}