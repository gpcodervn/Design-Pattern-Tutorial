package com.gpcoder.patterns.behavioral.cor.logger;

public class FileLogger extends Logger {

	public FileLogger(LogLevel logLevel) {
		super(logLevel);
	}

	@Override
	protected void writeMessage(String msg) {
		System.out.println("File logger: " + msg);
	}
}