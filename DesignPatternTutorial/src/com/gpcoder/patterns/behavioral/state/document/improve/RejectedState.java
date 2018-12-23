package com.gpcoder.patterns.behavioral.state.document.improve;

public class RejectedState implements State {

	@Override
	public void handleRequest() {
		System.out.println("Rejected");
	}
}
