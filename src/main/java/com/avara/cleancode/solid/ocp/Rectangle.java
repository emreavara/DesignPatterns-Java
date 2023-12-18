package com.avara.cleancode.solid.ocp;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle extends Shape{
  private double width;
  private double height;

  public double calculateArea() {
    return width*height;
  }
}
