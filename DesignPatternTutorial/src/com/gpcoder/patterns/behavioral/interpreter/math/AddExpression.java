package com.gpcoder.patterns.behavioral.interpreter.math;

public class AddExpression implements Expression {

	private String expression;

	public AddExpression(String expression) {
		this.expression = expression;
	}

	@Override
	public int interpret(InterpreterEngineContext context) {
		return context.add(expression);
	}
}