package com.gpcoder.patterns.behavioral.memento.point;

public class Memento {

	private double x;
	private double y;

	public Memento(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
}