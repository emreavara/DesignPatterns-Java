package com.avara.behavioral.state;

public class Done implements TaskState{

  public TaskStateType toType(){
    return TaskStateType.DONE;
  }
}
