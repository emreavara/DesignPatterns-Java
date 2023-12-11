package com.avara.structural.composite;

public class CompositeMain {
  public static void main(String[] args) {
    Animal cat = new Cat("Meowwww", 4);
    Animal dog = new Dog("Barkkk", 4);

    Mamals mamals = new Mamals("Cute Mamals");
    mamals.addAnimal(cat);
    mamals.addAnimal(dog);

    mamals.showDetails();

  }
}
