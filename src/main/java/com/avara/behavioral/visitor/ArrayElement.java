package com.avara.behavioral.visitor;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ArrayElement implements Element{
  private final Element[] elements;

  public void accept(JsonVisitor visitor) {
    visitor.visit(this);
  }
}
