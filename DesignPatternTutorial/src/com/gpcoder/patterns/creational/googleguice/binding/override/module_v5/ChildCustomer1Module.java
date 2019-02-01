package com.gpcoder.patterns.creational.googleguice.binding.override.module_v5;

import com.google.inject.AbstractModule;
import com.gpcoder.patterns.creational.googleguice.binding.override.base_service.ServiceB;
import com.gpcoder.patterns.creational.googleguice.binding.override.childcustomer1_service.ChildCustomer1ConcreteB;

public class ChildCustomer1Module extends AbstractModule {
	@Override
	protected void configure() {
		bind(ServiceB.class).to(ChildCustomer1ConcreteB.class);
	}
}