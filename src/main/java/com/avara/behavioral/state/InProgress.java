package com.avara.behavioral.state;

public class InProgress implements TaskState{

  public TaskState toDo(){
    return new ToDo();
  }

  public TaskState inReview() {
    return new InReview();
  }

  public TaskStateType toType(){
    return TaskStateType.IN_PROGRESS;
  }
}
