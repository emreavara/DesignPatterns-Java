package com.avara.structural.decorator;

public class ItalicTextDecorator extends TextDecorator{

  public ItalicTextDecorator(TextEditor textEditor) {
    super(textEditor);
  }

  public String getText() {
    return "<i>"+ super.getText() + "</i>";
  }
}
