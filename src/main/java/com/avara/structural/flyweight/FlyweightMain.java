package com.avara.structural.flyweight;

public class FlyweightMain {

  public static void main(String[] args) {
    UserFactory userFactory = new UserFactory();

    userFactory.getUser("guest");
    userFactory.getUser("admin");
    userFactory.getUser("guest");
    userFactory.getUser("guest");
    userFactory.getUser("guest");
    userFactory.getUser("guest");
    userFactory.getUser("guest");
  }
}
