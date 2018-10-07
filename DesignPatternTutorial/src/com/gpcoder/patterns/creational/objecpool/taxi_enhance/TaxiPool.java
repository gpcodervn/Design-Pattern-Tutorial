package com.gpcoder.patterns.creational.objecpool.taxi_enhance;

public interface TaxiPool {
	Taxi getTaxi();
	void release(Taxi taxi);
}
