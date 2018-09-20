package com.gpcoder.patterns.creational.abstractfactory.chair;

public class WoodChair implements Chair {
	@Override
	public void create() {
		System.out.println("Create wood chair");
	}
}
