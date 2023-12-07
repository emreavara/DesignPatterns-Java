package com.avara.creational.prototype;

public interface Weapon {
  Weapon clone(String name);
  String getName();
  void setName(String name);
}
