package com.gpcoder.patterns.creational.googleguice.injection.optional;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

interface MessageService {
	void sendMessage(String message);
}
class EmailService implements MessageService {
	@Override
	public void sendMessage(String message) {
		System.out.println("Email message: " + message);
	}
}
class Customer1EmailService extends EmailService {
	@Override
	public void sendMessage(String message) {
		System.out.println("Customer 1 email message: " + message);
	}
}
class BaseModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(MessageService.class).to(Customer1EmailService.class);
	}
}
class UserController {
	@Inject(optional=true)
	private MessageService messageService = new EmailService();
 
    public void send() {
        messageService.sendMessage("Optional injection example");
    }
}
public class OptionalInjectionExample {
	public static void main(String[] args) {
		// Inject by default
		Injector injector = Guice.createInjector();
		UserController userController = injector.getInstance(UserController.class);
		userController.send(); // Email message: Optional injection example
		
		// Inject by config
		injector = Guice.createInjector(new BaseModule());
		userController = injector.getInstance(UserController.class);
		userController.send(); // Customer 1 email message: Optional injection example
	}
}
