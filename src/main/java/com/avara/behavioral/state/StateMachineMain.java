package com.avara.behavioral.state;

public class StateMachineMain {
  public static void main(String[] args) {

    TaskStateMachine taskStateMachine = new TaskStateMachine();

    System.out.println("Initial State: " + taskStateMachine.getState());

    taskStateMachine.done();

    taskStateMachine.inProgress();
    System.out.println("Second State: " + taskStateMachine.getState());

    taskStateMachine.inReview();
    System.out.println("Third State: " + taskStateMachine.getState());

    taskStateMachine.toDo();

    taskStateMachine.inProgress();
    System.out.println("4th State: " + taskStateMachine.getState());

    taskStateMachine.inReview();
    System.out.println("5th State: " + taskStateMachine.getState());

    taskStateMachine.done();
    System.out.println("6th State: " + taskStateMachine.getState());
  }

}
