package com.avara.behavioral.visitor;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class NumberElement implements Element{
  private final int value;

  public void accept(JsonVisitor visitor) {
    visitor.visit(this);
  }
}
