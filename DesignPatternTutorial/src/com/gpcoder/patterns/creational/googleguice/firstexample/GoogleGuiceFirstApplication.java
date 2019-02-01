package com.gpcoder.patterns.creational.googleguice.firstexample;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

// Step 1: Create Interface
interface MessageService {
	void sendMessage(String message);
}

// Step 2: Create Implementation
class EmailService implements MessageService {
	@Override
	public void sendMessage(String message) {
		System.out.println("Email message: " + message);
	}
}

// Step 3: Create Bindings Module
class FirstModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(MessageService.class).to(EmailService.class);
	}
}

// Step 4: Create Class with dependency
class UserController {
    private MessageService messageService;
 
    @Inject
    public UserController(MessageService messageService) {
        this.messageService = messageService;
    }
 
    public void send() {
        messageService.sendMessage("Dependency injection with Google Guice example");
    }
}

// Step 5: Run application
public class GoogleGuiceFirstApplication {

	public static void main(String[] args) {
		// Step 5.1: Create Injector
		Injector injector = Guice.createInjector(new FirstModule());
		
		// Step 5.2: Get Object with dependency fulfilled
		UserController userController = injector.getInstance(UserController.class);
		
		// Step 5.3: Use the object
		userController.send();
	}
}
