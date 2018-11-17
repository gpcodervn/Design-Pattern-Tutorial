package com.gpcoder.patterns.structural.flyweight;

/**
 * Concrete Flyweight
 */
public class Soldier implements ISoldier {

	private final String name; // Intrinsic State

	public Soldier(String name) {
		this.name = name;
		System.out.println("Soldier is created! - " + name);
	}

	@Override
	public void promote(Context context) {
		System.out.println(name + " " + context.getId() + " promoted " + context.getStar());
	}
}
