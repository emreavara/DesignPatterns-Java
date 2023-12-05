package com.avara.creational.abstractfactory;

public class MilkIceCream extends Product {

  public Product produce() {
    System.out.println("Produce: MilkyIceCream");
    return new MilkIceCream();
  }
}
