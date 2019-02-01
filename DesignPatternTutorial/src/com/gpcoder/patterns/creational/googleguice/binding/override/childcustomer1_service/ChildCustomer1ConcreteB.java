package com.gpcoder.patterns.creational.googleguice.binding.override.childcustomer1_service;

import com.gpcoder.patterns.creational.googleguice.binding.override.base_service.ConcreteB;

public class ChildCustomer1ConcreteB extends ConcreteB {
	@Override
	public void sendMail() {
		System.out.println("ChildCustomer1ConcreteB");
	}

	public void doAnythingElse() {
		// Do any thing else
	}
}