package com.gpcoder.patterns.creational.googleguice.binding.override.base_service;

public class ConcreteA implements ServiceA {
	@Override
	public void log() {
		System.out.println("ConcreteA");
	}
}