package com.gpcoder.patterns.structural.flyweight;

/**
 * Extrinsic State
 */
public class Context {

	private String id;
	private int star;

	public Context(String id, int star) {
		this.id = id;
		this.star = star;
	}

	public String getId() {
		return this.id;
	}

	public int getStar() {
		return this.star;
	}
}
