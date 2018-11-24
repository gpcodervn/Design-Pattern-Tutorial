package com.gpcoder.patterns.behavioral.cor.logger;

public class AppLogger {

	public static Logger getLogger() {
		Logger consoleLogger = new ConsoleLogger(LogLevel.DEBUG);
		Logger fileLogger = consoleLogger.setNext(new FileLogger(LogLevel.ERROR));
		fileLogger.setNext(new EmailLogger(LogLevel.FATAL));
		return consoleLogger;
	}
}
