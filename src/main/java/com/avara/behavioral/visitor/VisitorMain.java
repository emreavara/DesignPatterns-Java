package com.avara.behavioral.visitor;

public class VisitorMain {
  public static void main(String[] args) {
    Element[] elements = {
        new NumberElement(42),
        new StringElement("Hello"),
        new ArrayElement(new Element[]{new NumberElement(1), new NumberElement(2), new NumberElement(3)})
    };
    JsonCreator jsonCreator = new JsonCreator();
    for(Element element : elements) {
      element.accept(jsonCreator);
    }
    System.out.println("Json Representation: " + jsonCreator.getJson());
  }
}
