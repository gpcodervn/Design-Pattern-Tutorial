package com.gpcoder.patterns.behavioral.nullobject.tax;

public interface Tax {

	String getCountry();

	double apply(double price);
}