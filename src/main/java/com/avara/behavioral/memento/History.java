package com.avara.behavioral.memento;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class History {
  private final List<EditorMemento> states;

  public History() {
    this.states = new ArrayList<>();
  }

  public void addMemento(EditorMemento editorMemento) {
    this.states.add(editorMemento);
  }

  public EditorMemento getMemento(int index) {
    return states.get(index);
  }
}
