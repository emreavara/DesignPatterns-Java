package com.avara.structural.decorator;

public class SimpleTextEditor implements TextEditor{

  private String text;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
