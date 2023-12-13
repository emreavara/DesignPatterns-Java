package com.avara.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class UserFactory {
  private final Map<String, User> users = new HashMap<>();

  public User getUser(String newUserName){
    if(users.containsKey(newUserName)){
      System.out.println("Getting User from stored...");
      return users.get(newUserName);
    } else {
      User newUser = new ConcreteUser(newUserName);
      users.put(newUserName, newUser);
      System.out.println("Creating new user...");
      return newUser;
    }
  }
}
