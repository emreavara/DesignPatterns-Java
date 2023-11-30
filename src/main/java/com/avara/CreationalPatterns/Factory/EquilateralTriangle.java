package com.avara.CreationalPatterns.Factory;

public class EquilateralTriangle implements Shape2D{

  private double length = 10;
  private double verticalHeigth = 10;

  public double calculateArea() {
    return length*verticalHeigth/2;
  }

  public double calculatePerimeter() {
    return length*3;
  }
}
