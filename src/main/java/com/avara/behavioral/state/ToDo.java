package com.avara.behavioral.state;

public class ToDo implements TaskState{

  @Override
  public TaskState inProgress(){
    return new InProgress();
  }

  public TaskStateType toType(){
    return TaskStateType.TODO;
  }
}
