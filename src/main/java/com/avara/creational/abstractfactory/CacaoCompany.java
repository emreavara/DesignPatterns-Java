package com.avara.creational.abstractfactory;

public class CacaoCompany implements Company{

  public void produceChocolate(String type) {
    return new DarkChocolate();
  }

  public void produceIceCream(String Type) {

  }
}
