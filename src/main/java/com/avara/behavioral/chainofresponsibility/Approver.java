package com.avara.behavioral.chainofresponsibility;

public interface Approver {
    void setNextApprover(Approver approver);

    ApprovalStatus processRequest(double amount);
}
