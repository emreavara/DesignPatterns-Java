package com.avara.structural.decorator;

public class TextDecorator implements TextEditor{

  private TextEditor textEditor;

  public TextDecorator(TextEditor textEditor){
    this.textEditor = textEditor;
  }

  public String getText() {
    return textEditor.getText();
  }

  public void setText(String text) {
    textEditor.setText(text);
  }
}
