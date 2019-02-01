package com.gpcoder.patterns.creational.googleguice.binding.override.module_v4;

import com.google.inject.AbstractModule;
import com.gpcoder.patterns.creational.googleguice.binding.override.base_service.ConcreteA;
import com.gpcoder.patterns.creational.googleguice.binding.override.base_service.ConcreteB;
import com.gpcoder.patterns.creational.googleguice.binding.override.base_service.ServiceA;
import com.gpcoder.patterns.creational.googleguice.binding.override.base_service.ServiceB;

public class BaseModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(ServiceA.class).to(ConcreteA.class);
		bind(ServiceB.class).to(ConcreteB.class);
	}
}