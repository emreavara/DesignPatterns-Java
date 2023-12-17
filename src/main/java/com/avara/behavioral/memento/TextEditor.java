package com.avara.behavioral.memento;

import lombok.AllArgsConstructor;


public class TextEditor {
  private StringBuilder content;

  public TextEditor() {
    this.content = new StringBuilder();
  }

  public void addText(String text) {
    content.append(text);
  }

  public String getContent() {
    return content.toString();
  }

  public EditorMemento save() {
    return new EditorMemento(content.toString());
  }

  public void restore(EditorMemento editorMemento) {
    this.content = new StringBuilder(editorMemento.getContent());
  }

}
