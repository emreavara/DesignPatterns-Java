package com.avara.structural.facade;

public class HomeTheaterFacade {

  private DvdPlayer dvdPlayer;
  private Speaker speaker;
  private Projector projector;

  public HomeTheaterFacade(DvdPlayer dvdPlayer, Speaker speaker, Projector projector) {
    this.dvdPlayer = dvdPlayer;
    this.speaker = speaker;
    this.projector = projector;
  }

  public void watchMovie() {
    System.out.println("Are you ready? We are starting ....");
    projector.on();
    projector.setWideScreenMode();
    speaker.on();
    speaker.setInputAsDvd();
    dvdPlayer.on();
    dvdPlayer.play();
  }

  public void endMovie() {
    System.out.println("Hope to see you again...");
    dvdPlayer.off();
    speaker.off();
    projector.off();

  }

}
