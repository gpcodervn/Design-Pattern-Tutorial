package com.gpcoder.patterns.creational.prototype.board2;

import java.util.concurrent.TimeUnit;

public class Cell {

	private String color;
	private String coordinate;

	public Cell(String color) {
		this.color = color;
		try {
			// More time to create an cell
			TimeUnit.MILLISECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Cell [color=" + color + "]";
	}
}
