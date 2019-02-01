package com.gpcoder.patterns.creational.googleguice.binding.linked;

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
class FirstModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(MessageService.class).to(EmailService.class);
		bind(EmailService.class).to(Customer1EmailService.class);
	}
}
class UserController {
    private MessageService messageService;
 
    @Inject
    public UserController(MessageService messageService) {
        this.messageService = messageService;
    }
 
    public void send() {
        messageService.sendMessage("Linked Binding example");
    }
}

public class LinkedBindingExample {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new FirstModule());
		UserController userController = injector.getInstance(UserController.class);
		userController.send(); // Customer 1 email message: Linked Binding example
	}
}
