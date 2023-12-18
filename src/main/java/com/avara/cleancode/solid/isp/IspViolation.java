package com.avara.cleancode.solid.isp;

public class IspViolation {
  interface Device {
    void turnOn();
    void turnOff();
    void playMedia();
    void connectWiFi();
    // Other methods related to devices
  }

  class Television implements Device {

    public void turnOn() {}

    public void turnOff() {}

    public void playMedia() {}

    public void connectWiFi() {}
  }

  class Smartphone implements Device {

    public void turnOn() {}

    public void turnOff() {}

    public void playMedia() {}

    public void connectWiFi() {}
  }
}
