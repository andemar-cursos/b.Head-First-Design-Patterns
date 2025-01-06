package com.andemar.domain.inheritance;

import com.andemar.domain.Duck;
import com.andemar.domain.Quackable;

public class RubberDuck extends Duck implements Quackable {

    public RubberDuck() {
        setName("Rubber");
    }

    @Override
    public void quack() {
        System.out.println("Quack: " + getName());
    }
}
