package com.avara.cleancode.solid.ocp;

import lombok.AllArgsConstructor;


public class ShapeViolates {
  private String shapeType;

  public double calculateArea(double... lengths) {
    if(shapeType.equals("Rectangle")) {
      return lengths[0]*lengths[1];
    } else if(shapeType.equals("Circle")) {
      return lengths[0] * lengths[0] * Math.PI;
    }
    return 0;
  }
}
