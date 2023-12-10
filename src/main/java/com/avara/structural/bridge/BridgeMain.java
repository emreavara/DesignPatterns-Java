package com.avara.structural.bridge;

public class BridgeMain {

  public static void main(String[] args) {
    NoobCook noobCookPizza = new NoobCook(new Pizza());
    ExperiencedCook experiencedCookPizza = new ExperiencedCook(new Pizza());

    noobCookPizza.cookMeal();
    experiencedCookPizza.cookMeal();

    System.out.println("#################################################");

    NoobCook noobCookSpaghetti = new NoobCook(new Spaghetti());
    ExperiencedCook experiencedCookSpaghetti = new ExperiencedCook(new Spaghetti());

    noobCookSpaghetti.cookMeal();
    experiencedCookSpaghetti.cookMeal();


  }
}
