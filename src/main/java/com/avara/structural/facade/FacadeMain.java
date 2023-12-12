package com.avara.structural.facade;

public class FacadeMain {
  public static void main(String[] args) {
    DvdPlayer dvdPlayer = new DvdPlayer();
    Speaker speaker = new Speaker();
    Projector projector = new Projector();

    HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, speaker, projector);

    homeTheaterFacade.watchMovie();

    System.out.println("####################################################");
    System.out.println("2 hours later...");
    System.out.println("####################################################");

    homeTheaterFacade.endMovie();
  }
}
