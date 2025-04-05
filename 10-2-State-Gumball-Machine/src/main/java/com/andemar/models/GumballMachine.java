package com.andemar.models;

import com.andemar.models.state.HasQuarterState;
import com.andemar.models.state.NoQuarterState;
import com.andemar.models.state.SoldOutState;
import com.andemar.models.state.SoldState;
import com.andemar.models.state.State;
import com.andemar.models.state.WinnerState;

public class GumballMachine {

  private final State soldOutState;
  private final State noQuarterState;
  private final State hasQuarterState;
  private final State soldState;
  private final State winnerState;

  private State state;
  private int count = 0;

  public GumballMachine(int numberGumballs) {
    this.soldOutState = new SoldOutState(this);
    this.noQuarterState = new NoQuarterState(this);
    this.hasQuarterState = new HasQuarterState(this);
    this.soldState = new SoldState(this);
    this.winnerState = new WinnerState(this);

    this.count = numberGumballs;
    if (numberGumballs > 0) {
      state = noQuarterState;
    } else {
      state = soldOutState;
    }
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }

  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  public void setState(State state) {
    this.state = state;
  }

  public void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count > 0) {
      count -= 1;
    }
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public State getSoldState() {
    return soldState;
  }

  public State getWinnerState() {
    return winnerState;
  }

  public int getCount() {
    return count;
  }

  @Override
  public String toString() {
    return String.format("Inventory: %d gumball%nMachine is waiting for quarter%nState: %s%n", count, state.print());
  }
}
