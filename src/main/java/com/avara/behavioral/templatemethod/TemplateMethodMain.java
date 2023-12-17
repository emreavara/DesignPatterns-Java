package com.avara.behavioral.templatemethod;

import java.sql.SQLOutput;

public class TemplateMethodMain {
  public static void main(String[] args) {
    System.out.println("Making a chocolate cake:");
    CakeRecipe chocolateCake = new ChocalateCake();
    chocolateCake.bakeCake();

    System.out.println("\nMaking a vanilla cake:");
    CakeRecipe vanillaCake = new VanillaCake();
    vanillaCake.bakeCake();
  }
}
