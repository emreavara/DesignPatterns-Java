package com.avara.creational.prototype;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Gun implements Weapon{

  private String name = "Gun";
  private int attackPower = 75;
  private int defencePower = 55;

  public Weapon clone(String name) {
    Weapon gun = new Gun();
    gun.setName(name);
    return gun;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
