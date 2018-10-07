package com.gpcoder.patterns.creational.objecpool.taxi_enhance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Eager pool
 * @author gpcoder
 */
public class TaxiPool2 implements TaxiPool {

	private static final long EXPIRED_TIME_IN_MILISECOND = 1000; // 2s
	private static final int NUMBER_OF_TAXI = 4;

	private final List<Taxi> available = Collections.synchronizedList(new ArrayList<>());
	private final List<Taxi> inUse = Collections.synchronizedList(new ArrayList<>());

	private final AtomicInteger count = new AtomicInteger(0);
	private final AtomicBoolean waiting = new AtomicBoolean(false);

	public TaxiPool2() {
		for (int i = 1; i <= NUMBER_OF_TAXI; i++) {
			Taxi taxi = this.createTaxi();
			available.add(taxi);
		}
	}

	@Override
	public synchronized Taxi getTaxi() {
		if (!available.isEmpty()) {
			Taxi taxi = available.remove(0);
			inUse.add(taxi);
			return taxi;
		}
		if (count.get() == NUMBER_OF_TAXI) {
			this.waitingWhenAvailable();
			return this.getTaxi();
		}
		Taxi taxi = this.createTaxi();
		inUse.add(taxi);
		return taxi;
	}

	@Override
	public synchronized void release(Taxi taxi) {
		inUse.remove(taxi);
		available.add(taxi);
		System.out.println(taxi.getName() + " is free");
	}

	private Taxi createTaxi() {
		Taxi taxi = new Taxi("Taxi " + count.incrementAndGet());
		System.out.println(taxi.getName() + " is created");
		return taxi;
	}

	private void waitingWhenAvailable() {
		if (waiting.get()) {
			waiting.set(false);
			throw new TaxiNotFoundException("No taxi available");
		}
		waiting.set(true);
		try {
			TimeUnit.MILLISECONDS.sleep(EXPIRED_TIME_IN_MILISECOND);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
