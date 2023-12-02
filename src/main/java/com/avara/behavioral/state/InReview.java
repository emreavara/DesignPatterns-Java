package com.avara.behavioral.state;

public class InReview implements TaskState{

  public TaskState done() {
    return new Done();
  }

  public TaskState inProgress() {
    return new InProgress();
  }

  public TaskStateType toType(){
    return TaskStateType.IN_REVIEW;
  }
}
