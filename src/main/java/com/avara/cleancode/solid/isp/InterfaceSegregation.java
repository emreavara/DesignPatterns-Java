package com.avara.cleancode.solid.isp;

public class InterfaceSegregation {
  interface Switchable {
    void turnOn();
    void turnOff();
  }

  interface MediaPlayer {
    void playMedia();
  }

  interface WiFiConnectable {
    void connectWiFi();
  }

  class Television implements Switchable, MediaPlayer {

    public void turnOn() {}

    public void turnOff() {}

    public void playMedia() {}

  }

  class Smartphone implements Switchable, MediaPlayer, WiFiConnectable {

    public void turnOn() {}

    public void turnOff() {}

    public void playMedia() {}

    public void connectWiFi() {}
  }

}
