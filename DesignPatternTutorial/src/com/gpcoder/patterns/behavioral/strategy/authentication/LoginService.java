package com.gpcoder.patterns.behavioral.strategy.authentication;

public class LoginService {

	private AuthStrategy authStrategy;
	
	public void setAuthStrategy(AuthStrategy authStrategy) {
		this.authStrategy = authStrategy;
	}

	public void login() {
		authStrategy.auth();
	}
}
