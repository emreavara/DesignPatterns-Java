package com.avara.structural.decorator;

public class BoldTextDecorator extends TextDecorator{
  public BoldTextDecorator(TextEditor textEditor) {
    super(textEditor);
  }

  public String getText() {
    return "<b>" + super.getText() + "</b>";
  }
}
