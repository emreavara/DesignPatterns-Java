package com.avara.structural.bridge;

public abstract class Cook {

  protected Meal meal;

  public Cook(Meal meal){
    this.meal = meal;
  }

  public void cookMeal(Meal meal){
    throw new Error("Invalid usage...");
  }

}
