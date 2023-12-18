package com.avara.cleancode.solid.srp;

public class CalculatorViolatesSrp {
  public int performOperation(int a, int b, char operation) {
    int result = 0;
    switch (operation) {
      case '+':
        result = a + b;
        break;
      case '-':
        result = a - b;
        break;
      // Other operations could be added here...
    }
    return result;
  }
}
