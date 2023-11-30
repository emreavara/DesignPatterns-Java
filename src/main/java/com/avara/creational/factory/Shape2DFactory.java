package com.avara.creational.factory;

public class Shape2DFactory {
  public static Shape2D createShape(Shape2DTypes shape) {
    switch (shape){
      case SQUARE:
        return new Square();
      case TRIANGLE:
        return new EquilateralTriangle();
      case RECTANGLE:
        return new Reactangle();
      default:
        return null;
    }
  }

}
