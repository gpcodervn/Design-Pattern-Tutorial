package com.gpcoder.patterns.behavioral.state.document.improve;

public class SubmittedState implements State {

	@Override
	public void handleRequest() {
		System.out.println("Submitted");
	}
}