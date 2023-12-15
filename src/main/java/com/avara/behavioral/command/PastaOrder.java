package com.avara.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PastaOrder implements Order{

  private Kitchen kitchen;

  public void execute() {
    kitchen.makePasta();
  }
}
