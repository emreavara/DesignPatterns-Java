package com.avara.creational.builder;

public class BuilderMain {

  public static void main(String[] args){
    ItalianPizzaBuilder italianPizzaBuilder = new ItalianPizzaBuilder();

    Pizza pizza = italianPizzaBuilder
        .size("medium")
        .type("regular")
        .addTopping("mushrooms")
        .addTopping("peperoni")
        .addTopping("onions")
        .build();

    System.out.println(pizza);
  }

}
