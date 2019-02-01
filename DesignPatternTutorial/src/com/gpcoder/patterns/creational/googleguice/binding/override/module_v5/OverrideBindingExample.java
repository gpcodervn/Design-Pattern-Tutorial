package com.gpcoder.patterns.creational.googleguice.binding.override.module_v5;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.util.Modules;
import com.gpcoder.patterns.creational.googleguice.binding.override.base_service.BaseLogic;
import com.gpcoder.patterns.creational.googleguice.binding.override.customer1_service.Customer1Logic;

public class OverrideBindingExample {

	public static void main(String[] args) {
		Module customer1Module = Modules.override(new BaseModule()).with(new Customer1Module());
		Module childCustomer1Module = Modules.override(customer1Module).with(new ChildCustomer1Module());

		Injector injector = Guice.createInjector(childCustomer1Module);
		BaseLogic customer1Logic = injector.getInstance(Customer1Logic.class);
		customer1Logic.execute();
	}
}
