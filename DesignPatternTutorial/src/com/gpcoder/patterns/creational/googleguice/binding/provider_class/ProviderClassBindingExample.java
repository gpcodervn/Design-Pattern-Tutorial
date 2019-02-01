package com.gpcoder.patterns.creational.googleguice.binding.provider_class;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

interface MessageService {
	void sendMessage(String message);
}
class EmailService implements MessageService {
	@Override
	public void sendMessage(String message) {
		System.out.println("Email message: " + message);
	}
}
class MessageServiceProvider implements Provider<MessageService> {
	@Override
	public MessageService get() {
		// Do some complicated task
		return new EmailService();
	}
}
class FirstModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(MessageService.class).toProvider(MessageServiceProvider.class);
	}
}
class UserController {
    private MessageService messageService;
 
    @Inject
    public UserController(MessageService messageService) {
        this.messageService = messageService;
    }
 
    public void send() {
        messageService.sendMessage("Provider Class Binding example");
    }
}
public class ProviderClassBindingExample {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new FirstModule());
		UserController userController = injector.getInstance(UserController.class);
		userController.send(); // Email message: Provider Class Binding example
	}
}
