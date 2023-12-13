package com.avara.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ConcreteUser implements User{

  private String userName;

  public void showUserName() {
    System.out.println("UserName: " + userName);
  }
}
