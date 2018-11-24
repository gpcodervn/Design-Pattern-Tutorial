package com.gpcoder.patterns.behavioral.cor.leaverequest;

public class Supervisor extends Approver {

	@Override
	protected boolean canApprove(int numberOfDays) {
		return numberOfDays <= 3;
	}

	@Override
	protected void doApproving(LeaveRequest request) {
		System.out.println("Leave request approved for " + request.getDays() + " days by Supervisor");
	}
}