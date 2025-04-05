package com.andemar.models;

import static com.andemar.enums.GumballStateEnum.HAS_QUARTER;
import static com.andemar.enums.GumballStateEnum.NO_QUARTER;
import static com.andemar.enums.GumballStateEnum.SOLD;
import static com.andemar.enums.GumballStateEnum.SOLD_OUT;

import com.andemar.enums.GumballStateEnum;

public class GumballMachine {
  private GumballStateEnum state;
  private int count = 0;

  public GumballMachine(int count) {
    this.count = count;
    if (count > 0) {
      state = NO_QUARTER;
    }
  }

  public void insertQuarter() {
    if (state == HAS_QUARTER) {
      System.out.println("You can't insert another quarter");
    } else if (state == NO_QUARTER) {
      state = HAS_QUARTER;
      System.out.println("You inserted a quarter");
    } else if (state == SOLD_OUT) {
      System.out.println("You can't insert a quarter, the machine is sold out");
    } else if (state == SOLD) {
      System.out.println("Please wait, we're already giving you a gumball");
    }
  }

  public void ejectQuarter() {
    if (state == HAS_QUARTER) {
      System.out.println("Quarter returned");
      state = NO_QUARTER;
    } else if (state == NO_QUARTER) {
      System.out.println("You haven't inserted a quarter");
    } else if (state == SOLD) {
      System.out.println("Sorry, you already turned the crank");
    } else if (state == SOLD_OUT) {
      System.out.println("You cant eject, you haven't inserted a quearter yet");
    }
  }

  public void turnCrank() {
    if (state == SOLD) {
      System.out.println("Turning twice doesn't get you another gumball");
    } else if (state == NO_QUARTER) {
      System.out.println("You turned but there's no quarter");
    } else if (state == SOLD_OUT) {
      System.out.println("You turned, but there are no gumballs");
    } else if (state == HAS_QUARTER) {
      System.out.println("You turned...");
      state = SOLD;
      dispense();
    }
  }

  private void dispense() {
    if (state == SOLD) {
      System.out.println("A gumball comes rolling out the slot");
      count = count - 1;
      if (count == 0) {
        System.out.println("Oops, out of gumballs!");
        state = SOLD_OUT;
      } else {
        state = NO_QUARTER;
      }
    } else if (state == NO_QUARTER) {
      System.out.println("You need to pay first");
    } else if (state == SOLD_OUT) {
      System.out.println("No gumball dispensed");
    } else if (state == HAS_QUARTER) {
      System.out.println("You need to turn the crank");
    }
  }

  @Override
  public String toString() {
    return String.format("Inventory: %d gumball%nMachine is waiting for quarter%nState: %s%n", count, state.toString());
  }
}
