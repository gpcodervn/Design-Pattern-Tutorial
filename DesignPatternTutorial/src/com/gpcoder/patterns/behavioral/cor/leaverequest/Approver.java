package com.gpcoder.patterns.behavioral.cor.leaverequest;

public abstract class Approver {

	protected Approver nextApprover;

	public void approveLeave(LeaveRequest request) {
		System.out.println("Checking permission for " + this.getClass().getSimpleName());
		if (this.canApprove(request.getDays())) {
			this.doApproving(request);
		} else if (nextApprover != null) {
			nextApprover.approveLeave(request);
		}
	}

	public void setNext(Approver approver) {
		this.nextApprover = approver;
	}

	protected abstract boolean canApprove(int numberOfDays);

	protected abstract void doApproving(LeaveRequest request);
}
