package com.andemar;

import com.andemar.models.Amplifier;
import com.andemar.models.PopCornPopper;
import com.andemar.models.Projector;
import com.andemar.models.Screen;
import com.andemar.models.StreamingPlayer;
import com.andemar.models.TheaterLight;
import com.andemar.models.facade.HomeTheaterFacade;

public class Main {

  public static void main(String[] args) {

    HomeTheaterFacade facade = new HomeTheaterFacade(
        new Amplifier(),
        new StreamingPlayer(),
        new Projector(),
        new TheaterLight(),
        new Screen(),
        new PopCornPopper()
    );

    // Only one method call to execute all the steps
    facade.watchMovie("The Lord of the Rings");
    facade.endMovie();
  }
}