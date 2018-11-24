package com.gpcoder.patterns.behavioral.cor.logger;

public abstract class Logger {

	protected LogLevel logLevel;

	protected Logger nextlogger; // The next Handler in the chain

	public Logger(LogLevel logLevel) {
		this.logLevel = logLevel;
	}

	// Set the next logger to make a list/chain of Handlers.
	public Logger setNext(Logger nextlogger) {
		this.nextlogger = nextlogger;
		return nextlogger;
	}

	public void log(LogLevel severity, String msg) {
		if (logLevel.getLevel() <= severity.getLevel()) {
			writeMessage(msg);
		}
		if (nextlogger != null) {
			nextlogger.log(severity, msg);
		}
	}

	protected abstract void writeMessage(String msg);
}
