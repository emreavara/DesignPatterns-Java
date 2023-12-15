package com.avara.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BurgerOrder implements Order{
  private Kitchen kitchen;

  public void execute() {
    kitchen.makeBurger();
  }
}
