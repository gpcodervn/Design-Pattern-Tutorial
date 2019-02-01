package com.gpcoder.patterns.creational.googleguice.binding.providedby_annotation;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.ProvidedBy;
import com.google.inject.Provider;

@ProvidedBy(MessageServiceProvider.class)
interface MessageService {
	void sendMessage(String message);
}
class EmailService implements MessageService {
	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}
}
class MessageServiceProvider implements Provider<MessageService> {
	@Override
	public MessageService get() {
		// Do some complicated task
		return new EmailService();
	}
}
class UserController {
    @Inject
    private MessageService messageService;
 
    public void send() {
        messageService.sendMessage("@ProvidedBy annotation binding example");
    }
}
public class ImplementatedByAnnotationBindingExample {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector();
		UserController userController = injector.getInstance(UserController.class);
		userController.send(); // @ProvidedBy annotation binding example
	}
}
