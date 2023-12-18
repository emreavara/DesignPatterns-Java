package com.avara.cleancode.yagni;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskComplex {
  private String description;
  private boolean isCompleted;

  public TaskComplex(String description) {
    this.description = description;
    this.isCompleted = false;
  }

  public void markAsCompleted() {
    this.isCompleted = true;
  }

  // Unnecessary

  public String[] getKeywordsFromDescription() {
    return description.split("\\s+");
  }
}
