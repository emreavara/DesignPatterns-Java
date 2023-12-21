package com.avara.oop.abstraction;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle extends Shape{
  private double radius;

  public double getArea() {
    return Math.PI * radius * radius;
  }
}
