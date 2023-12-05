package com.avara.creational.abstractfactory;

public class MilkChocolate extends Product {


  public Product produce() {
    System.out.println("Produced: White Chocolate");

    return new MilkChocolate();
  }
}
