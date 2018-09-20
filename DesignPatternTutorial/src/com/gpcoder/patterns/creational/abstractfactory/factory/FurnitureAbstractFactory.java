package com.gpcoder.patterns.creational.abstractfactory.factory;

import com.gpcoder.patterns.creational.abstractfactory.chair.Chair;
import com.gpcoder.patterns.creational.abstractfactory.table.Table;

public abstract class FurnitureAbstractFactory {

	public abstract Chair createChair();

	public abstract Table createTable();
	
}
