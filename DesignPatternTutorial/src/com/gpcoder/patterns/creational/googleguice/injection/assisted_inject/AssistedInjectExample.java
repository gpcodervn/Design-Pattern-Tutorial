package com.gpcoder.patterns.creational.googleguice.injection.assisted_inject;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.FactoryModuleBuilder;

// 01. Defining a factory
// Create an interface whose methods return the constructed type, or any of its supertypes. 
// The method's parameters are the arguments required to build the constructed type.
interface CallerFactory {
	UserController create(Integer callerId, String signature);
}

interface MessageService {
	void sendMessage(String message);
}

class EmailService implements MessageService {
	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}
}

class BasicModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(MessageService.class).to(EmailService.class);
		// 02. Configuring simple factories
		install(new FactoryModuleBuilder().build(CallerFactory.class));
	}
}

class UserController {
	private MessageService messageService;
	private Integer callerId;
	private String signature;

	// 03. @Assisted: Annotates an injected parameter or field whose value comes
	// from an argument to a factory method
	@Inject
	public UserController(@Assisted Integer callerId, @Assisted String signature, MessageService messageService) {
		this.callerId = callerId;
		this.signature = signature;
		this.messageService = messageService;
	}

	public void send() {
		messageService.sendMessage("CallerId " + callerId + ": Assisted Inject example by " + signature);
	}
}

public class AssistedInjectExample {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new BasicModule());

		// 04. Inject a factory that combines the caller's arguments with
		// injector-supplied values to construct objects
		CallerFactory callerFactory = injector.getInstance(CallerFactory.class);
		UserController userController = callerFactory.create(1, "gpcoder.com");
		userController.send(); // CallerId 1: Assisted Inject example by gpcoder.com
	}
}
