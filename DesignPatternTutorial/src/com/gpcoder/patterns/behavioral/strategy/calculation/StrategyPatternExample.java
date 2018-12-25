package com.gpcoder.patterns.behavioral.strategy.calculation;

public class StrategyPatternExample {

	public static void main(String[] args) {
		Context context = new Context(new Addition());
		System.out.println("Addition = " + context.executeStrategy(2, 3));

		context = new Context(new Subtraction());
		System.out.println("Subtraction = " + context.executeStrategy(5, 2));

		context = new Context(new Multiplication());
		System.out.println("Multiplication = " + context.executeStrategy(2, 3));
	}
}
