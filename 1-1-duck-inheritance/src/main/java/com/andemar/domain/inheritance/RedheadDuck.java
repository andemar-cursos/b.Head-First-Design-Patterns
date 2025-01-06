package com.andemar.domain.inheritance;

import com.andemar.domain.Duck;
import com.andemar.domain.Flyable;
import com.andemar.domain.Quackable;

public class RedheadDuck extends Duck implements Quackable, Flyable {

    public RedheadDuck() {
        setName("Redhead");
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
