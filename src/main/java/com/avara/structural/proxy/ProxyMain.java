package com.avara.structural.proxy;

public class ProxyMain {
  public static void main(String[] args) {
    ProxyAccountService unauthorizedProxyAccess = new ProxyAccountService("guest", "guestPassword");
    unauthorizedProxyAccess.getBalance();
    unauthorizedProxyAccess.deposit(500);
    unauthorizedProxyAccess.getBalance();

    // Authorized
    ProxyAccountService authorizedProxyAccess = new ProxyAccountService("admin", "password");
    authorizedProxyAccess.getBalance();
    authorizedProxyAccess.deposit(500);
    authorizedProxyAccess.getBalance();
  }
}
