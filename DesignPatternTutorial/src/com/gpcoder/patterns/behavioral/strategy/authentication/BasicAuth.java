package com.gpcoder.patterns.behavioral.strategy.authentication;

public class BasicAuth implements AuthStrategy {

	@Override
	public void auth() {
		System.out.println("Basic authentication");
	}
}