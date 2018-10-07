package com.gpcoder.patterns.creational.objecpool.taxi;

public class TaxiApp {

	public static final int NUM_OF_CLIENT = 8;

	public static void main(String[] args) {
		TaxiPool taxiPool = new TaxiPool();
		for (int i = 1; i <= NUM_OF_CLIENT; i++) {
			Runnable client = new ClientThread(taxiPool);
			Thread thread = new Thread(client);
			thread.start();
		}
	}
}
