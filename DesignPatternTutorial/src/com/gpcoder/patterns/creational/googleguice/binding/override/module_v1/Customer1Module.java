package com.gpcoder.patterns.creational.googleguice.binding.override.module_v1;

import com.gpcoder.patterns.creational.googleguice.binding.override.base_service.ServiceB;
import com.gpcoder.patterns.creational.googleguice.binding.override.customer1_service.ConcreteC;
import com.gpcoder.patterns.creational.googleguice.binding.override.customer1_service.Customer1ConcreteB;
import com.gpcoder.patterns.creational.googleguice.binding.override.customer1_service.ServiceC;

public class Customer1Module extends BaseModule {
	@Override
	protected void configure() {
		super.configure();
		bind(ServiceC.class).to(ConcreteC.class);
		bind(ServiceB.class).to(Customer1ConcreteB.class); // ServiceB was already configured
	}
}