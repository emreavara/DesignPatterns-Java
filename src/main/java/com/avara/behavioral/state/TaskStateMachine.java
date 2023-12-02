package com.avara.behavioral.state;

import lombok.Getter;

public class TaskStateMachine{

  private TaskState state;

  public TaskStateMachine() {
    state = new ToDo();
  }
  // Alternative GETTER
  //  public TaskStateType getState() {
  //    if(state instanceof ToDo){
  //      return TaskStateType.TODO;
  //    }
  //    if(state instanceof  InProgress){
  //      return TaskStateType.IN_PROGRESS;
  //    }
  //    if(state instanceof  InReview){
  //      return TaskStateType.IN_REVIEW;
  //    }
  //    if(state instanceof Done) {
  //      return TaskStateType.DONE;
  //    }
  //    return null;
  //  }

  public TaskStateType getState() {
    return state.toType();
  }

  public void toDo(){
    state = state.toDo();
  }

  public void inProgress(){
    state = state.inProgress();
  }

  public void inReview(){
    state = state.inReview();
  }

  public void done(){
    state = state.done();
  }
}
