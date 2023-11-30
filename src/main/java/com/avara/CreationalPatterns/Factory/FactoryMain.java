package com.avara.CreationalPatterns.Factory;

public class FactoryMain {

  public static void main(String[] args) {

    // SQUARE
    Shape2D square = Shape2DFactory.createShape(Shape2DTypes.SQUARE);
    System.out.println("Square: ");
    System.out.println("   Area      : " + square.calculateArea());
    System.out.println("   Perimeter : " + square.calculatePerimeter());


    // EquiliteralTriangle
    Shape2D triangle = Shape2DFactory.createShape(Shape2DTypes.TRIANGLE);
    System.out.println("Triangle: ");
    System.out.println("   Area      : " + triangle.calculateArea());
    System.out.println("   Perimeter : " + triangle.calculatePerimeter());

    // Rectangle
    Shape2D rectangle = Shape2DFactory.createShape(Shape2DTypes.RECTANGLE);
    System.out.println("Triangle: ");
    System.out.println("   Area      : " + rectangle.calculateArea());
    System.out.println("   Perimeter : " + rectangle.calculatePerimeter());

  }

}
