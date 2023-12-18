package com.avara.cleancode.solid.lsp;

import lombok.Setter;

@Setter
public class Square extends Shape{
  private double sideLength;

  @Override
  public double getArea() {
    return sideLength * sideLength;
  }
}
