package com.gpcoder.patterns.creational.googleguice.scope.withoutsingleton;

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
		System.out.println(message + ": " + System.identityHashCode(this));
	}
}

class FirstModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(MessageService.class).to(EmailService.class);
	}
}

class UserController {
	private MessageService messageService;

	@Inject
	public UserController(MessageService messageService) {
		this.messageService = messageService;
	}

	public void send() {
		messageService.sendMessage("Singleton Scoped example");
	}
}

public class GuiceScopedExample {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new FirstModule());

		UserController userController = injector.getInstance(UserController.class);
		userController.send();

		userController = injector.getInstance(UserController.class);
		userController.send();
	}
}