package com.avara.cleancode.yagni;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskSimple {
  private String description;
  private boolean isCompleted;

  public TaskSimple(String description) {
    this.description = description;
    this.isCompleted = false;
  }

  public void markAsCompleted() {
    this.isCompleted = true;
  }
}
