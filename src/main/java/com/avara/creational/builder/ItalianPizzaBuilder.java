package com.avara.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class ItalianPizzaBuilder implements PizzaBuilder{

  private String type;
  private final List<String> toppings = new ArrayList<>();
  private String size;

  public PizzaBuilder type(String type) {
    this.type = type;
    return this;
  }

  public PizzaBuilder addTopping(String topping) {
    this.toppings.add(topping);
    return this;
  }

  public PizzaBuilder size(String size) {
    this.size = size;
    return this;
  }

  public Pizza build() {
    return new Pizza(type, toppings, size);
  }

}
