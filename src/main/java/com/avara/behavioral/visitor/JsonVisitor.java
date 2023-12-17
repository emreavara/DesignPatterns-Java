package com.avara.behavioral.visitor;

public interface JsonVisitor {
  void visit(NumberElement element);
  void visit(StringElement element);
  void visit(ArrayElement element);
}
