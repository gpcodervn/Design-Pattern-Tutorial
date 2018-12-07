package com.gpcoder.patterns.behavioral.interpreter.roman;

public class Context {
	private String input;
	private int output;

	public Context(String input) {
		this.input = input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}

	public int getOutput() {
		return output;
	}

	public void setOutput(int output) {
		this.output = output;
	}
}
