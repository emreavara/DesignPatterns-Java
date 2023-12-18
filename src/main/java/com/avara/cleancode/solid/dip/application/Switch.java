package com.avara.cleancode.solid.dip.application;

public class Switch {
  private Switchable device;

  public void turnOn() {
    device.turnOn();
  }

  public void turnOff() {
    device.turnOff();
  }
}
