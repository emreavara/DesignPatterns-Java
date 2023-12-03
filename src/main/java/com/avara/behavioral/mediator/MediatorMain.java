package com.avara.behavioral.mediator;

public class MediatorMain {
  public static void main(String[] args) {
    ConcreteMessageMediator messageMediator = new ConcreteMessageMediator();

    User user1 = new ConcreteUser(messageMediator);
    User user2 = new ConcreteUser(messageMediator);

    messageMediator.setUser1(user1);
    messageMediator.setUser2(user2);

    user1.sendMessage("How are you user2?", user2);

    user2.sendMessage("Fine, and you user1? ", user1);

  }

}
