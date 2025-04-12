package com.andemar.models.state;

import com.andemar.models.GumballMachine;

public class WinnerState implements State {

  private final GumballMachine gumballMachine;

  public WinnerState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  @Override
  public void insertQuarter() {
    System.out.println("You can't insert a quarter, the machine is sold out");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("You cant eject, you haven't inserted a quarter yet");
  }

  @Override
  public void turnCrank() {
    System.out.println("You turned, but there are no gumballs");
  }

  @Override
  public void dispense() {
    gumballMachine.releaseBall();
    if (gumballMachine.getCount() == 0) {
      gumballMachine.setState(gumballMachine.getSoldOutState());
    } else {
      gumballMachine.releaseBall();
      System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
      if(gumballMachine.getCount() > 0) {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
      } else {
        System.out.println("Opps, out of gumballs!");
        gumballMachine.setState(gumballMachine.getSoldOutState());
      }

    }
  }
}
