package com.gpcoder.patterns.creational.googleguice.binding.override.customer1_service;

import com.gpcoder.patterns.creational.googleguice.binding.override.base_service.ConcreteB;

public class Customer1ConcreteB extends ConcreteB {
	@Override
	public void sendMail() {
		System.out.println("Customer1ConcreteB");
	}

	public void doAnythingElse() {
		// Do any thing else
	}
}