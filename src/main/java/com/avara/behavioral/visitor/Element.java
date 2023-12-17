package com.avara.behavioral.visitor;

public interface Element {
  void accept(JsonVisitor visitor);

}
