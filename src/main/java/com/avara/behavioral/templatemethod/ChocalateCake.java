package com.avara.behavioral.templatemethod;

public class ChocalateCake extends CakeRecipe{

  protected void prepareIngredients() {
    System.out.println("Preparing chocolate cake ingredients...");
  }

  protected void mixIngredients() {
    System.out.println("Mixing chocolate cake ingredients...");
  }

  protected void bake() {
    System.out.println("Baking the chocolate cake...");
  }

  protected void decorate() {
    System.out.println("Decorating the chocolate cake...");
  }

  protected boolean additionalDecorations() {
    return true;
  }
}
