package com.gpcoder.patterns.behavioral.interpreter.tree_traversal;

public class MultiplyExpression implements Expression {

	private Expression leftExpression;
	private Expression rightExpresion;

	public MultiplyExpression(Expression leftExpression,
			Expression rightExpresion) {
		this.leftExpression = leftExpression;
		this.rightExpresion = rightExpresion;
	}

	@Override
	public int interpret() {

		return leftExpression.interpret() * rightExpresion.interpret();
	}
}