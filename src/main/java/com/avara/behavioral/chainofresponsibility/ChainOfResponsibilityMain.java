package com.avara.behavioral.chainofresponsibility;

public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        Approver manager = new Manager(1000);
        Approver cto = new Manager(5000);
        Approver ceo = new Manager(10000);

        double purchaseRequestAmount = 3000;

        ApprovalStatus status = manager.processRequest(purchaseRequestAmount);
        System.out.println("Purchase Request Status: " + status);

        manager.setNextApprover(cto);

        status = manager.processRequest(purchaseRequestAmount);
        System.out.println("Purchase Request Status: " + status);

        purchaseRequestAmount = 7000;

        status = manager.processRequest(purchaseRequestAmount);
        System.out.println("Purchase Request Status: " + status);

        manager.setNextApprover(ceo);

        status = manager.processRequest(purchaseRequestAmount);
        System.out.println("Purchase Request Status: " + status);

    }
}
