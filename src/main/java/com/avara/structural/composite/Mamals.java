package com.avara.structural.composite;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mamals implements Animal {
  private String name;
  private List<Animal> animals = new ArrayList<>();

  public Mamals(String name) {
    this.name = name;
  }

  public void addAnimal(Animal animal){
    animals.add(animal);
  }

  public void removeAnimal(Animal animal) {
    animals.remove(animal);
  }

  public void showDetails() {
    System.out.println("Mamals: " + this.name);
    System.out.println("Animals: ");
    for(Animal animal: animals){
      animal.showDetails();
    }
  }
}
