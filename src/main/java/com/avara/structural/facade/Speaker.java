package com.avara.structural.facade;

public class Speaker {
  public void on(){
    System.out.println("Speaker is on...");
  }

  public void setInputAsDvd(){
    System.out.println("Speaker is set for DVD input...");
  }

  public void setSurroundSound() {
    System.out.println("Speaker is set for surround sound...");
  }

  public void off(){
    System.out.println("Speaker is off...");
  }
}
