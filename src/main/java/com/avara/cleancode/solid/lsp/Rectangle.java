package com.avara.cleancode.solid.lsp;

import lombok.Setter;

@Setter
public class Rectangle extends Shape{
  protected double width;
  protected double height;

  @Override
  public double getArea() {
    return  width*height;
  }
}
