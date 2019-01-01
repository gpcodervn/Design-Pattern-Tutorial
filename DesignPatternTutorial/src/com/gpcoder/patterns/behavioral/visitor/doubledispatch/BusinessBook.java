package com.gpcoder.patterns.behavioral.visitor.doubledispatch;

public class BusinessBook implements Book {
	public void accept(Visitor v) {
		v.visit(this);
	}

	public String getPublisher() {
		return "The publisher of business book";
	}
}