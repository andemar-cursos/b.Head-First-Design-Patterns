package com.andemar.models.facade;

import com.andemar.models.Amplifier;
import com.andemar.models.PopCornPopper;
import com.andemar.models.Projector;
import com.andemar.models.Screen;
import com.andemar.models.StreamingPlayer;
import com.andemar.models.TheaterLight;

public class HomeTheaterFacade {
  Amplifier amplifier;
  StreamingPlayer player;
  Projector projector;
  TheaterLight light;
  Screen screen;
  PopCornPopper popper;

  public HomeTheaterFacade(Amplifier amplifier, StreamingPlayer player, Projector projector, TheaterLight light, Screen screen, PopCornPopper popCornPopper) {
    this.amplifier = amplifier;
    this.player = player;
    this.projector = projector;
    this.light = light;
    this.screen = screen;
    this.popper = popCornPopper;
  }

  public void watchMovie(String movie) {
    System.out.println("Get ready to watch a movie...");
    popper.on();
    popper.pop();
    light.dim(10);
    screen.down();
    projector.on();
    projector.wideScreenMode();
    amplifier.on();
    amplifier.setStreamingPlayer(player);
    amplifier.setSurroundSound();
    amplifier.setVolume(5);
    player.on();
    player.play(movie);
  }

  public void endMovie() {
    System.out.println("Shutting movie theater down...");
    popper.off();
    light.on();
    screen.up();
    projector.off();
    amplifier.off();
    player.stop();
    player.off();
  }
}
