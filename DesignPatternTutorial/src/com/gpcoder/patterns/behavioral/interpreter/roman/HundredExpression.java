package com.gpcoder.patterns.behavioral.interpreter.roman;

public class HundredExpression extends Expression {

	@Override
	public String one() {
		return "C";
	}

	@Override
	public String four() {
		return "CD";
	}

	@Override
	public String five() {
		return "D";
	}

	@Override
	public String nine() {
		return "CM";
	}

	@Override
	public int multiplier() {
		return 100;
	}
}