package com.gpcoder.patterns.creational.abstractfactory.factory.impl;

import com.gpcoder.patterns.creational.abstractfactory.chair.Chair;
import com.gpcoder.patterns.creational.abstractfactory.chair.WoodChair;
import com.gpcoder.patterns.creational.abstractfactory.factory.FurnitureAbstractFactory;
import com.gpcoder.patterns.creational.abstractfactory.table.Table;
import com.gpcoder.patterns.creational.abstractfactory.table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {

	@Override
	public Chair createChair() {
		return new WoodChair();
	}

	@Override
	public Table createTable() {
		return new WoodTable();
	}
}
