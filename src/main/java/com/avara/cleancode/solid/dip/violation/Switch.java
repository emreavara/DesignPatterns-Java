package com.avara.cleancode.solid.dip.violation;

public class Switch {
  public void turnOn() {
    // Logic to turn on the light
    Light light = new Light();
    light.turnOn();
  }

  public void turnOff() {
    // Logic to turn off the light
    Light light = new Light();
    light.turnOff();
  }
}
