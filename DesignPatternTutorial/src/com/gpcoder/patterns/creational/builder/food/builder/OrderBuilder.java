package com.gpcoder.patterns.creational.builder.food.builder;

import com.gpcoder.patterns.creational.builder.food.product.order.Order;
import com.gpcoder.patterns.creational.builder.food.product.type.BreadType;
import com.gpcoder.patterns.creational.builder.food.product.type.OrderType;
import com.gpcoder.patterns.creational.builder.food.product.type.SauceType;
import com.gpcoder.patterns.creational.builder.food.product.type.VegetableType;

public interface OrderBuilder {

	OrderBuilder orderType(OrderType orderType);

	OrderBuilder orderBread(BreadType breadType);

	OrderBuilder orderSauce(SauceType sauceType);

	OrderBuilder orderVegetable(VegetableType vegetableType);

	Order build();

}