package com.avara.oop.abstraction;

public class AbstractionMain {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(5, 3);
    Circle circle = new Circle(7);

    System.out.println("Area of rectangle: " + rectangle.getArea());
    System.out.println("Area of circle   : " + circle.getArea());

  }

}
