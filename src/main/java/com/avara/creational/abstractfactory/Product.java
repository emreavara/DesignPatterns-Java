package com.avara.creational.abstractfactory;

public abstract class  Product {

    private double price;
    Product() {
        price = 6;
    }

    abstract Product produce();
}
