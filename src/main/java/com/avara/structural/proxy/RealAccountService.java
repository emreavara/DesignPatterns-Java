package com.avara.structural.proxy;

public class RealAccountService implements AccountService{

  private double balance;

  public RealAccountService() {
    balance = 0;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public double getBalance() {
    return balance;
  }
}
