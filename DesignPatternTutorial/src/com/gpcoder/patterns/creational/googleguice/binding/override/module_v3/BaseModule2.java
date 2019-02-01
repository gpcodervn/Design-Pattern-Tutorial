package com.gpcoder.patterns.creational.googleguice.binding.override.module_v3;

import com.google.inject.AbstractModule;
import com.gpcoder.patterns.creational.googleguice.binding.override.base_service.ConcreteB;
import com.gpcoder.patterns.creational.googleguice.binding.override.base_service.ServiceB;

public class BaseModule2 extends AbstractModule {
	@Override
	protected void configure() {
		bind(ServiceB.class).to(ConcreteB.class);
	}
}