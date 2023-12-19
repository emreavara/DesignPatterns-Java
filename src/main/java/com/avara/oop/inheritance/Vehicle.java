package com.avara.oop.inheritance;

public class Vehicle {
  private String brand;
  private String model;

  public Vehicle(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public void start() {
    System.out.println("The vehicle is starting.");
  }
}
