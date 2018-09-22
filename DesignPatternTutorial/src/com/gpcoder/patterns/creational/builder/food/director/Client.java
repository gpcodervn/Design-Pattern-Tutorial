package com.gpcoder.patterns.creational.builder.food.director;

import com.gpcoder.patterns.creational.builder.food.concretebuilder.FastFoodOrderBuilder;
import com.gpcoder.patterns.creational.builder.food.product.order.Order;
import com.gpcoder.patterns.creational.builder.food.product.type.BreadType;
import com.gpcoder.patterns.creational.builder.food.product.type.OrderType;
import com.gpcoder.patterns.creational.builder.food.product.type.SauceType;

public class Client {

	public static void main(String[] args) {
		Order order = new FastFoodOrderBuilder()
				.orderType(OrderType.ON_SITE).orderBread(BreadType.OMELETTE)
				.orderSauce(SauceType.SOY_SAUCE).build();
		System.out.println(order);
	}
}
