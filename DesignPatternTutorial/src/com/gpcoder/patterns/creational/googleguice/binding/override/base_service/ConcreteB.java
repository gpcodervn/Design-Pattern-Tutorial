package com.gpcoder.patterns.creational.googleguice.binding.override.base_service;

public class ConcreteB implements ServiceB {
	@Override
	public void sendMail() {
		System.out.println("ConcreteB");
	}
}