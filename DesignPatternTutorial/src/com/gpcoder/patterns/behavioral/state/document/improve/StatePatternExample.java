package com.gpcoder.patterns.behavioral.state.document.improve;

public class StatePatternExample {

	public static void main(String[] args) {
		DocumentContext context = new DocumentContext();

		context.setState(new NewState());
		context.applyState();

		context.setState(new SubmittedState());
		context.applyState();

		context.setState(new ApprovedState());
		context.applyState();
	}
}
