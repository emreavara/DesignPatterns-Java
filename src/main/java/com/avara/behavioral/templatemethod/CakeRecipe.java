package com.avara.behavioral.templatemethod;

public abstract class CakeRecipe {

  public final  void bakeCake(){
    prepareIngredients();
    mixIngredients();
    bake();
    decorate();
    if(additionalDecorations()) {
      addAdditionalDecorations();
    }
    serve();
  }

  protected  abstract void prepareIngredients();
  protected  abstract void mixIngredients();
  protected  abstract void bake();
  protected  abstract void decorate();

  protected boolean additionalDecorations() {
    return false;
  }

  protected void addAdditionalDecorations() {
    System.out.println("Adding additional decorations...");
  }

  protected void serve() {
    System.out.println("Serve the delicious cake...");
  }



}
