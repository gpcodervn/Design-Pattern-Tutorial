package com.gpcoder.patterns.behavioral.strategy.calculation;

public class Subtraction implements Strategy {

	@Override
	public float calculate(float a, float b) {
		return a - b;
	}
}