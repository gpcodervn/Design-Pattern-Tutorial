package com.gpcoder.patterns.behavioral.command.document;

public class Client {

	public static void main(String[] args) {
		DocumentInvoker instance = new DocumentInvoker();
		instance.write("The 1st text. ");
		instance.undo();
		instance.read(); // EMPTY
		
		instance.redo();
		instance.read(); // The 1st text.

		instance.write("The 2nd text. ");
		instance.write("The 3rd text. ");
		instance.read(); // The 1st text. The 2nd text. The 3rd text. 
		instance.undo(); // The 1st text. The 2nd text.
		instance.undo(); // The 1st text.
		instance.undo(); // EMPTY
		instance.undo(); // Nothing to undo
	}
}
