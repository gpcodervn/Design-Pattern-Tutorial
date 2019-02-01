package com.gpcoder.patterns.creational.googleguice.binding.constructor;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

interface MessageService {
	void sendMessage(String message);
}
class EmailService implements MessageService {
	
	private String email;
	
	public EmailService() {
		this.email = "Default email";
	}
	
	public EmailService(@Named("email") String email) {
		this.email = email;
	}
	
	@Override
	public void sendMessage(String message) {
		System.out.println(email + ": " + message);
	}
}
class FirstModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(String.class).annotatedWith(Names.named("email")).toInstance("gpcodervn@gmail.com");
		// bind(MessageService.class).to(EmailService.class);
		try {
			bind(MessageService.class).toConstructor(EmailService.class.getConstructor(String.class));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
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
public class ConstructorBindingExample {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new FirstModule());
		UserController userController = injector.getInstance(UserController.class);
		userController.send(); // Hello constant bindings
	}
}
