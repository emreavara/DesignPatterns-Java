package com.avara.cleancode.solid.dip.application;

public class Light implements Switchable{

  public void turnOn() {
    System.out.println("Turn on the light");
  }

  public void turnOff() {
    System.out.println("Turn off the light");
  }
}
