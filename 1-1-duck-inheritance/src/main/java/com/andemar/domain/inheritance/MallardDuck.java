package com.andemar.domain.inheritance;

import com.andemar.domain.Duck;
import com.andemar.domain.Flyable;
import com.andemar.domain.Quackable;

public class MallardDuck extends Duck implements Quackable, Flyable {

    public MallardDuck() {
        setName("Mallard");
    }

    @Override
    public void quack() {
        System.out.println("Quack: " + getName());
    }

    @Override
    public void fly() {
        System.out.println("I'm flying: " + getName());
    }
}
