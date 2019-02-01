package com.gpcoder.patterns.creational.googleguice.binding.override.module_v2;

import com.gpcoder.patterns.creational.googleguice.binding.override.base_service.ConcreteB;
import com.gpcoder.patterns.creational.googleguice.binding.override.customer1_service.ConcreteC;
import com.gpcoder.patterns.creational.googleguice.binding.override.customer1_service.Customer1ConcreteB;
import com.gpcoder.patterns.creational.googleguice.binding.override.customer1_service.ServiceC;

public class Customer1Module extends BaseModule {
	@Override
	protected void configure() {
		super.configure();
		bind(ServiceC.class).to(ConcreteC.class);
		bind(ConcreteB.class).to(Customer1ConcreteB.class); // ServiceB -> ConcreteB -> Customer1ConcreteB
	}
}