package com.avara.creational.abstractfactory;

public class AbstractFactoryMain {
  public static void main(String[] args){
    Company cacaoCompany = CompanyProducer.getCompany(ProductIngredient.CACAO);
    Product iceCreamProduct = cacaoCompany.produceProduct(ProductType.ICE_CREAM);
    iceCreamProduct.produce();

    Product iceCreamProductChocolate = cacaoCompany.produceProduct(ProductType.CHOCOLATE);
    iceCreamProductChocolate.produce();

    Company milkCompany = CompanyProducer.getCompany(ProductIngredient.MILK);
    Product chocolateProduct = milkCompany.produceProduct(ProductType.CHOCOLATE);
    chocolateProduct.produce();

    Product iceCreamProductMilk = milkCompany.produceProduct(ProductType.ICE_CREAM);
    iceCreamProductMilk.produce();


  }
}
