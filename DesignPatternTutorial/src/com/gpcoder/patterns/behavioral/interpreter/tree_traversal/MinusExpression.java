package com.gpcoder.patterns.behavioral.interpreter.tree_traversal;

public class MinusExpression  implements Expression {

	private Expression leftExpression;
	private Expression rightExpresion;

	public MinusExpression(Expression leftExpression,
			Expression rightExpresion) {
		this.leftExpression = leftExpression;
		this.rightExpresion = rightExpresion;
	}

	@Override
	public int interpret() {

		return leftExpression.interpret() - rightExpresion.interpret();
	}
}