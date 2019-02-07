package com.gpcoder.patterns.creational.googleguice.scope.level;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

interface MessageService {
	void sendMessage(String message);
}

// Class level
// @Singleton
class EmailService implements MessageService {
	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}
}

class BasicModule extends AbstractModule {
	// Configuration level
	@Override
	protected void configure() {
		bind(MessageService.class).to(EmailService.class); // .in(Singleton.class);
	}

	// Method level
	@Singleton
	@Provides
	public MessageService provideMessageService() {
		return new EmailService();
	}
}
