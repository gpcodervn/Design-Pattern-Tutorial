package com.gpcoder.patterns.behavioral.mediator.chat;

public class ChatClient {
	
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl("Java design pattern");
		
		User admin = new UserImpl(mediator, "GP Coder");
		User user1 = new UserImpl(mediator, "User 1");
		User user2 = new UserImpl(mediator, "User 2");
		User user3 = new UserImpl(mediator, "User 3");
		
		mediator.addUser(admin);
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);

		admin.send("Hi All");
		user1.send("Hi Admin");
	}
}
