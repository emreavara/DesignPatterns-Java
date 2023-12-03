package com.avara.behavioral.mediator;

public class ConcreteUser implements User{

  private MessageMediator messageMediator;

  public ConcreteUser(MessageMediator mediator){
    messageMediator = mediator;
  }

  public void sendMessage(String message, User user) {
    messageMediator.sendMessage(message, user);
  }

  public void receiveMessage(String message) {
    System.out.println("- "+ message);
  }
}
