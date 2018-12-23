package com.gpcoder.patterns.behavioral.state.document.improve;

public class ApprovedState implements State {

	@Override
	public void handleRequest() {
		System.out.println("Approved");
	}
}
