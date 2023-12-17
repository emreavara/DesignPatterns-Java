package com.avara.behavioral.visitor;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class StringElement implements Element{
  private final String value;

  public void accept(JsonVisitor visitor) {
    visitor.visit(this);
  }
}
