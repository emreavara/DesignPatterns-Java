package com.avara.creational.builder;

public interface PizzaBuilder {
  PizzaBuilder type(String type);
  PizzaBuilder addTopping(String topping);

  PizzaBuilder size(String size);

  Pizza build();

}
