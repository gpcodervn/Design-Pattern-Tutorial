package com.gpcoder.patterns.creational.googleguice.binding.override.base_service;

import com.google.inject.Inject;

public class BaseLogic {

	@Inject
	private ServiceA serviceA;

	@Inject
	private ServiceB serviceB;

	public void execute() {
		serviceA.log();
		serviceB.sendMail();
	}
}
