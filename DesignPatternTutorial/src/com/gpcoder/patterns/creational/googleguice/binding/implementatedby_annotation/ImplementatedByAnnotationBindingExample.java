package com.gpcoder.patterns.creational.googleguice.binding.implementatedby_annotation;

import com.google.inject.Guice;
import com.google.inject.ImplementedBy;
import com.google.inject.Inject;
import com.google.inject.Injector;

@ImplementedBy(EmailService.class)
interface MessageService {
	void sendMessage(String message);
}
class EmailService implements MessageService {
	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}
}
class UserController {
    @Inject
    private MessageService messageService;
 
    public void send() {
        messageService.sendMessage("@ImplementatedBy annotation binding example");
    }
}
public class ImplementatedByAnnotationBindingExample {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector();
		UserController userController = injector.getInstance(UserController.class);
		userController.send(); // @ImplementatedBy annotation binding example
	}
}
