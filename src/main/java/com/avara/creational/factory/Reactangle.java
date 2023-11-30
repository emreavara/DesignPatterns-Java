package com.avara.creational.factory;

public class Reactangle implements Shape2D{

  private double length = 10;
  private double breadth = 20;
  public double calculateArea() {
    return length*breadth;
  }

  public double calculatePerimeter() {
    return 2*(length+breadth);
  }
}
