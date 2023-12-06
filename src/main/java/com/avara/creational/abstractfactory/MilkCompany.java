package com.avara.creational.abstractfactory;

public class MilkCompany implements Company {

  public Product produceProduct(ProductType type) {
    switch (type) {
      case ICE_CREAM:
        return new MilkIceCream();
      case CHOCOLATE:
        return new MilkChocolate();
      default:
        return new MilkIceCream();
    }
  }
}
