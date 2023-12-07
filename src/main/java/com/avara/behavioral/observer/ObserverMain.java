package com.avara.behavioral.observer;

public class ObserverMain {
  public static void main(String[] args) {
    VideoPublisher videoPublisher = new VideoPublisher();

    Observer videoAddict = new Subscriber("John");
    Observer influencerGirl = new Subscriber("Jennifer");

    videoPublisher.subscribe(videoAddict);

    videoPublisher.postVideo("Amazing day trip to Rome!!");
    System.out.println("A few months later....");
    videoPublisher.subscribe(influencerGirl);

    videoPublisher.postVideo("First experiences in a mountain hotel!!");
  }
}
