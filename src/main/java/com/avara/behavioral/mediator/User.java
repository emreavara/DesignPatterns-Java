package com.avara.behavioral.mediator;

public interface User {
  void sendMessage(String message, User user);
  void receiveMessage(String message);
}
