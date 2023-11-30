package com.avara.creational.builder;

import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Pizza {
  private String type;
  private List<String> toppings;
  private String size;

  public String toString() {
    String pizzaString = "Ordered Pizza: \n";
    pizzaString += "Type: "+ type;
    pizzaString += "\nToppings:";
    if(!toppings.isEmpty()){
      for(String topping : toppings){
        pizzaString += "\n\t - "+ topping ;
      }
    }
    pizzaString += "\nSize: " + size;
    return  pizzaString;
  }
}
