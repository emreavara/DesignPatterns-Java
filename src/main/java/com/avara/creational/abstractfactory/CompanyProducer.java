package com.avara.creational.abstractfactory;

public class CompanyProducer {

  public static Company getCompany(ProductIngredient productIngredient) {
    switch (productIngredient){
      case MILK:
        return new MilkCompany();
      case CACAO:
        return new CacaoCompany();
      default:
        return new CacaoCompany();
    }
  }

}
