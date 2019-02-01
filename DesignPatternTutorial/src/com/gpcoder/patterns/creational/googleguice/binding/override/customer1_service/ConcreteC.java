package com.gpcoder.patterns.creational.googleguice.binding.override.customer1_service;

public class ConcreteC implements ServiceC {
	@Override
	public void save() {
		System.out.println("ConcreteC");
	}
}