package com.gpcoder.patterns.behavioral.strategy.authentication;

public class OpenIDAuth implements AuthStrategy {

	@Override
	public void auth() {
		System.out.println("OpenID authentication");
	}
}