package com.avara.behavioral.observer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Subscriber implements Observer{
  private String name;

  public void update(String videoTitle) {
    System.out.println("Hey " + this.name + " Our new video is online: ** " + videoTitle + " **");
  }
}
