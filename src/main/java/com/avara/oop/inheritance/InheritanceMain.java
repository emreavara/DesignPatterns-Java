package com.avara.oop.inheritance;

public class InheritanceMain {

  public static void main(String[] args) {
    Car car = new Car("Toyota", "Corolla", 4);

    System.out.println("Brand: " + car.getBrand());
    System.out.println("Model: " + car.getModel());

    System.out.println("Number of doors: " + car.getDoors());
    car.start();
    car.drive();
  }
}
