package com.avara.structural.proxy;

public class ProxyAccountService implements AccountService {

  private String userName;
  private String password;
  private RealAccountService realAccountService;

  public ProxyAccountService(String userName, String password){
    this.userName = userName;
    this.password = password;
    this.realAccountService = new RealAccountService();
  }

  public void deposit(double amount) {
    if(authenticate()){
      System.out.println("Deposited Amount: "+ amount);
      realAccountService.deposit(amount);
    } else {
      System.out.println("Unauthorized access detected!!!");
    }
  }

  public double getBalance() {
    if(authenticate()){
      double balance = realAccountService.getBalance();
      System.out.println("Balance: " + balance);
      return balance;
    } else {
      System.out.println("Unauthorized access detected!!!");
    }
    return 0;
  }

  private boolean authenticate() {
    return userName.equals("admin") && password.equals("password");
  }
}
