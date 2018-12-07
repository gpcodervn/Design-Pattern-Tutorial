package com.gpcoder.patterns.behavioral.interpreter.roman;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		String[] romans = { "IV", "XII", "CLIX", "MMXVIII", "MMMDLIV" };
		for (String roman : romans) {
			convertRomanToNumber(roman);
		}
	}

	private static void convertRomanToNumber(String roman) {
		List<Expression> tree = new ArrayList<>();
		tree.add(new ThousandExpression());
		tree.add(new HundredExpression());
		tree.add(new TenExpression());
		tree.add(new OneExpression());

		Context context = new Context(roman);
		for (Expression exp : tree) {
			exp.interpret(context);
		}
		System.out.println(roman + " = " + context.getOutput());
	}
}
