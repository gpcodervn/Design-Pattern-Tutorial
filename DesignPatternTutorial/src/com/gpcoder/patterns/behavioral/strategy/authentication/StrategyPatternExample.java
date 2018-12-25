package com.gpcoder.patterns.behavioral.strategy.authentication;

public class StrategyPatternExample {

	public static void main(String[] args) {
		
		LoginService loginService = new LoginService();
		loginService.setAuthStrategy(new BasicAuth());
		loginService.login();

		loginService.setAuthStrategy(new OpenIDAuth());
		loginService.login();
	}
}
