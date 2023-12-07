package com.avara.behavioral.observer;

public interface Subject {
  void subscribe(Observer oberver);
  void unsubscribe(Observer observer);

  void notifyObservers();

}
