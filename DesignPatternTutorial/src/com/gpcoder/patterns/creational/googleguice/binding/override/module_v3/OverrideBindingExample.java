package com.gpcoder.patterns.creational.googleguice.binding.override.module_v3;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.gpcoder.patterns.creational.googleguice.binding.override.base_service.BaseLogic;
import com.gpcoder.patterns.creational.googleguice.binding.override.customer1_service.Customer1Logic;

public class OverrideBindingExample {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new BaseModule1(), new Customer1Module());
		BaseLogic customer1Logic = injector.getInstance(Customer1Logic.class);
		customer1Logic.execute();
	}
}
