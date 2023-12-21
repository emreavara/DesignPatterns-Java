package com.avara.oop.abstraction;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle extends Shape{
  private double length;
  private double width;

  // Implementing the abstract method to calculate area for Rectangle
  public double getArea() {
    return length*width;
  }
}
