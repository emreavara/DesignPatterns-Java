package com.avara.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

  private List<Order> orders;

  public Waiter() {
    orders = new ArrayList<>();
  }

  void takeOrder(Order order) {
    orders.add(order);
  }

  void placeOrder() {
    orders
        .stream()
        .forEach(Order::execute);
    orders.clear();
  }
}
