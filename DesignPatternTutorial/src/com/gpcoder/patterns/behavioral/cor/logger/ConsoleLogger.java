package com.gpcoder.patterns.behavioral.cor.logger;

public class ConsoleLogger extends Logger {

	public ConsoleLogger(LogLevel logLevel) {
		super(logLevel);
	}

	@Override
	protected void writeMessage(String msg) {
		System.out.println("Console logger: " + msg);
	}
}
