package com.avara.behavioral.mediator;

import lombok.Setter;

public class ConcreteMessageMediator implements MessageMediator{
  User user1;

  User user2;

  public void setUser1(User user) {
    this.user1 = user;
  }

  public void setUser2(User user) {
    this.user2 = user;
  }

  public void sendMessage(String message, User user) {
    if(user == user1){
      user2.receiveMessage(message);
    } else {
      user2.receiveMessage(message);
    }
  }
}
