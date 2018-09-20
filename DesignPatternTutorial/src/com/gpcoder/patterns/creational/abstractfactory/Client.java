package com.gpcoder.patterns.creational.abstractfactory;

import com.gpcoder.patterns.creational.abstractfactory.chair.Chair;
import com.gpcoder.patterns.creational.abstractfactory.factory.FurnitureAbstractFactory;
import com.gpcoder.patterns.creational.abstractfactory.factory.FurnitureFactory;
import com.gpcoder.patterns.creational.abstractfactory.table.Table;

public class Client {

	public static void main(String[] args) {

		FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.FLASTIC);

		Chair chair = factory.createChair();
		chair.create();

		Table table = factory.createTable();
		table.create();
	}
}
