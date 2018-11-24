package com.gpcoder.patterns.behavioral.cor.logger;

public class EmailLogger extends Logger {

	public EmailLogger(LogLevel logLevel) {
		super(logLevel);
	}

	@Override
	protected void writeMessage(String msg) {
		System.out.println("Email logger: " + msg);
	}
}