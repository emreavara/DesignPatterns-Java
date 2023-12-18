package com.avara.cleancode.solid.ocp;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle extends Shape{
  private double radius;

  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}
