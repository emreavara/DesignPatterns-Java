package com.avara.behavioral.observer;

import java.util.ArrayList;
import java.util.List;


public class VideoPublisher implements Subject {

  private List<Observer> observerList = new ArrayList<>();
  private String newVideoTitle;

  public void postVideo(String videoTitle) {
    this.newVideoTitle = videoTitle;
    notifyObservers();
  }

  public void subscribe(Observer oberver) {
    this.observerList.add(oberver);
  }

  public void unsubscribe(Observer observer) {
    this.observerList.remove(observer);
  }

  public void notifyObservers() {
    for(Observer observer: observerList){
      observer.update(this.newVideoTitle);
    }
  }
}
