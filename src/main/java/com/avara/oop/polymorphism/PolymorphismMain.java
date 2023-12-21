package com.avara.oop.polymorphism;

public class PolymorphismMain {
  public static void main(String[] args) {
    Animal dog = new Dog();
    Animal cat = new Cat();

    dog.makeSound();
    cat.makeSound();
  }
}
