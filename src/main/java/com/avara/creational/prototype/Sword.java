package com.avara.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sword implements Weapon{
  private String name = "Sword";
  private int attackPower = 45;
  private int defencePower = 75;

  @Override
  public Weapon clone(String name) {
    Weapon sword =  new Sword();
    sword.setName(name);
    return sword;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
