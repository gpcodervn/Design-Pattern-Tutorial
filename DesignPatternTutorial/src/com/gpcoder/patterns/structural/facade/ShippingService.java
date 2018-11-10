package com.gpcoder.patterns.structural.facade;

public class ShippingService {

	public void freeShipping() {
		System.out.println("Free Shipping");
	}

	public void standardShipping() {
		System.out.println("Standard Shipping");
	}

	public void expressShipping() {
		System.out.println("Express Shipping");
	}
}
