package com.avara.creational.abstractfactory;

public class DarkChocolate extends Product {
  public Product produce() {
    System.out.println("Produced: Dark Chocolate");
    return new DarkChocolate();
  }
}
