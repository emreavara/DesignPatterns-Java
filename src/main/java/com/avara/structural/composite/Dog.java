package com.avara.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Dog implements Animal{
    private String name;
    private int numberOfLegs;

    public void showDetails() {
      System.out.println("Dog: " + this.name + " Number of Legs: " + this.numberOfLegs);
    }
}
