package com.avara.structural.adapter;

public class AdapterMain {

  public static void main(String[] args) {

    double amount = 100;

    Money usd = new Money("USD", 0.96);
    Money euro = new Money("EURO", 1.05);

    double result = MoneyAdapter.convert(100, usd, euro);

    System.out.println(amount + " USD converted to EURO. Result: " + result);
  }
}
