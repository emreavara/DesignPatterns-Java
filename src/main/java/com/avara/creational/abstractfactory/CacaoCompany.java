package com.avara.creational.abstractfactory;

public class CacaoCompany implements Company {

  public Product produceProduct(ProductType type) {
    switch (type){
      case ICE_CREAM:
        return new ChocolateIceCream();
      case CHOCOLATE:
        return new DarkChocolate();
      default:
        return new ChocolateIceCream();
    }
  }
}
