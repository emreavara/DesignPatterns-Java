package com.avara.oop.inheritance;

public class Car extends Vehicle{
  private int doors;

  public Car(String brand, String model, int doors) {
    super(brand, model); // Call superclass constructor
    this.doors = doors;
  }

  public int getDoors() {
    return doors;
  }

  public void drive() {
    System.out.println("The car is moving.");
  }
}
