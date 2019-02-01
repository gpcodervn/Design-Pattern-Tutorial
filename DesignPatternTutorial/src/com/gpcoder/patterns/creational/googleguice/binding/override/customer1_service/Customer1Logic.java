package com.gpcoder.patterns.creational.googleguice.binding.override.customer1_service;

import com.google.inject.Inject;
import com.gpcoder.patterns.creational.googleguice.binding.override.base_service.BaseLogic;

public class Customer1Logic extends BaseLogic {

	@Inject
	private ServiceC serviceC;
	
	@Override
	public void execute() {
		super.execute();
		serviceC.save();
	}
}
