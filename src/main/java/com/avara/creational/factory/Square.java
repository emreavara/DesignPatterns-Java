package com.avara.creational.factory;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Square implements Shape2D{

  private double length = 10;

  public double calculateArea() {
    return length*length;
  }

  public double calculatePerimeter() {
    return 4*length;
  }
}
