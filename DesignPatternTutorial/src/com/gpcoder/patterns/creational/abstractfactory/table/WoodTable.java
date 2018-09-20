package com.gpcoder.patterns.creational.abstractfactory.table;

public class WoodTable implements Table {
	@Override
	public void create() {
		System.out.println("Create wood table");
	}
}