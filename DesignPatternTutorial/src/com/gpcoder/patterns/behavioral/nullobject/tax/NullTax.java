package com.gpcoder.patterns.behavioral.nullobject.tax;

public class NullTax implements Tax {

	private String country = "UNKNOWN_COUNTRY";

	public NullTax(String country) {
		if (country != null) {
			this.country = country;
		}
	}

	@Override
	public String getCountry() {
		return country;
	}

	@Override
	public double apply(double price) {
		return price * 1;
	}
}