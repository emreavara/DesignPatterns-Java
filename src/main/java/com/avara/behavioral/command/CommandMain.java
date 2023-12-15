package com.avara.behavioral.command;

public class CommandMain {
  public static void main(String[] args) {
    Kitchen kitchen = new Kitchen();
    Waiter waiter = new Waiter();

    BurgerOrder burgerOrder = new BurgerOrder(kitchen);
    PastaOrder pastaOrder = new PastaOrder(kitchen);

    waiter.takeOrder(burgerOrder);
    waiter.takeOrder(pastaOrder);

    waiter.placeOrder();
  }
}
