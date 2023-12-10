package com.avara.structural.bridge;

public class ExperiencedCook extends Cook {

  public ExperiencedCook(Meal meal) {
    super(meal);
  }

  public void cookMeal() {
    System.out.println("Experienced cook is cooking...");
    super.meal.cookMeal();

  }
}
