package com.avara.behavioral.memento;

public class MementoMain {
  public static void main(String[] args) {
    TextEditor textEditor = new TextEditor();
    History history = new History();

    textEditor.addText("Initial content...");
    history.addMemento(textEditor.save());

    textEditor.addText("Another content...");
    history.addMemento(textEditor.save());

    System.out.println("Current Content: \n" + textEditor.getContent());

    EditorMemento editorMemento = history.getMemento(0);
    textEditor.restore(editorMemento);

    System.out.println("\nRestored Content: \n" + textEditor.getContent());
  }
}
