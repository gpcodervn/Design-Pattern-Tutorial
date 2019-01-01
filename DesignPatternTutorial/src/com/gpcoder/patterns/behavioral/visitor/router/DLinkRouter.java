package com.gpcoder.patterns.behavioral.visitor.router;

public class DLinkRouter implements Router {

	@Override
	public void sendData(char[] data) {
	}

	@Override
	public void acceptData(char[] data) {
	}

	@Override
	public void accept(RouterVisitor v) {
		v.visit(this);
	}
}