package com.avara.structural.decorator;

public class DecoratorMain {
  public static void main(String[] args) {
    TextEditor textEditor = new ItalicTextDecorator(new BoldTextDecorator(new SimpleTextEditor()));
    textEditor.setText("Importan Text");
    System.out.println(textEditor.getText());
  }
}
