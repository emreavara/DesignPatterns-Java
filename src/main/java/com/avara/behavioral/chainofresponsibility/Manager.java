package com.avara.behavioral.chainofresponsibility;

import java.util.Objects;

public class Manager implements Approver {
    private Approver nextApprover;
    private double maxLimit;

    public Manager(double maxLimit) {
        this.maxLimit = maxLimit;
    }

    @Override
    public void setNextApprover(Approver approver) {
        this.nextApprover = approver;
    }

    @Override
    public ApprovalStatus processRequest(double amount) {
        if (amount < maxLimit) {
            return ApprovalStatus.APPROVED;
        } else if (Objects.isNull(nextApprover)) {
            return ApprovalStatus.REJECTED;
        }
        return nextApprover.processRequest(amount);
    }
}
