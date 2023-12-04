package com.avara.creational.singleton;

public class DisplaySettings {

  private static DisplaySettings displaySettings;
  private int DEFAULT_VALUE = 50;

  private int brigthness;

  private DisplaySettings(){
    brigthness = DEFAULT_VALUE;
  }


  public static DisplaySettings getInstance() {
    if(displaySettings == null){
      displaySettings = new DisplaySettings();
    }
    return displaySettings;
  }

  public int getBrigthness() {
    return  brigthness;
  }

  public int increaseBrightness() {
    brigthness += 1;
    return  brigthness;
  }

  public int decreaseBrightness() {
    brigthness -= 1;
    return  brigthness;
  }

}
