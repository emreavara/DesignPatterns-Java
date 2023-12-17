package com.avara.behavioral.templatemethod;

public class VanillaCake extends CakeRecipe{
  protected void prepareIngredients() {
    System.out.println("Preparing vanilla cake ingredients...");
  }

  protected void mixIngredients() {
    System.out.println("Mixing vanilla cake ingredients...");
  }

  protected void bake() {
    System.out.println("Baking the vanilla cake...");
  }

  protected void decorate() {
    System.out.println("Decorating the vanilla cake...");
  }
}
