package com.gpcoder.patterns.creational.dependencyinjection.di;

public class EmailService implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println("Email message: " + message);
	}
}
