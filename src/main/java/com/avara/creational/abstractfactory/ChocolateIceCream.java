package com.avara.creational.abstractfactory;

public class ChocolateIceCream extends Product {

  public Product produce() {
    System.out.println("Produced: ChocolateIceCream");
    return new ChocolateIceCream();
  }
}
