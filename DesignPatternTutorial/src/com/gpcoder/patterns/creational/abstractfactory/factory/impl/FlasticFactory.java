package com.gpcoder.patterns.creational.abstractfactory.factory.impl;

import com.gpcoder.patterns.creational.abstractfactory.chair.Chair;
import com.gpcoder.patterns.creational.abstractfactory.chair.PlasticChair;
import com.gpcoder.patterns.creational.abstractfactory.factory.FurnitureAbstractFactory;
import com.gpcoder.patterns.creational.abstractfactory.table.PlasticTable;
import com.gpcoder.patterns.creational.abstractfactory.table.Table;

public class FlasticFactory extends FurnitureAbstractFactory {

	@Override
	public Chair createChair() {
		return new PlasticChair();
	}

	@Override
	public Table createTable() {
		return new PlasticTable();
	}

}
