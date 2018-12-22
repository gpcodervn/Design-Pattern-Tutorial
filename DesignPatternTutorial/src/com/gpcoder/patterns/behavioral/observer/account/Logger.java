package com.gpcoder.patterns.behavioral.observer.account;

public class Logger implements Observer {

	@Override
	public void update(User user) {
		System.out.println("Logger: " + user);
	}
}