package com.avara.behavioral.state;

public interface TaskState {
  default TaskState toDo(){
    System.out.println("Invaild State Transition");
    return new ToDo();
  }

  default TaskState inProgress(){
    System.out.println("Invaild State Transition");
    return new InProgress();
  }

  default TaskState inReview(){
    System.out.println("Invaild State Transition");
    return new InReview();
  }

  default TaskState done(){
    System.out.println("Invaild State Transition");
    return new Done();
  }

  TaskStateType toType();
}
