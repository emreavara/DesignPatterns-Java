package com.avara.behavioral.visitor;

import java.util.Arrays;

public class JsonCreator implements JsonVisitor{
  StringBuilder json = new StringBuilder();

  public void visit(NumberElement element) {
    json.append(element.getValue());
  }

  public void visit(StringElement element) {
    json.append("\"").append(element.getValue()).append("\"");
  }

  public void visit(ArrayElement element) {
    json.append("[");
    Element[] elements = element.getElements();
    for(int i = 0; i< elements.length; i++) {
      elements[i].accept(this);
      if(i < elements.length - 1) {
        json.append(", ");
      }
    }
    json.append("]");
  }
  public String getJson() {
    return json.toString();
  }
}
