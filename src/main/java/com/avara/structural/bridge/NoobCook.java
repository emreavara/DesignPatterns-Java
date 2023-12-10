package com.avara.structural.bridge;

public class NoobCook extends Cook{

  public NoobCook(Meal meal) {
    super(meal);
  }

  public void cookMeal() {
    System.out.println("Noob cook is cooking...");
    super.meal.cookMeal();
  }
}
