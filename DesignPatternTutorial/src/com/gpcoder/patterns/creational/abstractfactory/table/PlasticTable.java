package com.gpcoder.patterns.creational.abstractfactory.table;

public class PlasticTable implements Table {
	@Override
	public void create() {
		System.out.println("Create plastic table");
	}
}
