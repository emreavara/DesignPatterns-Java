package com.avara.creational.singleton;

public class SingletonMain {
  public static void main(String[] args) {
    DisplaySettings displaySettings = DisplaySettings.getInstance();

    System.out.println(displaySettings.getBrigthness());
    System.out.println(displaySettings.increaseBrightness());
    System.out.println(displaySettings.increaseBrightness());

    System.out.println("New Instance:");

    DisplaySettings displaySettings2 = DisplaySettings.getInstance();

    System.out.println(displaySettings2.getBrigthness());
    System.out.println(displaySettings2.increaseBrightness());
    System.out.println(displaySettings2.decreaseBrightness());
  }
}
