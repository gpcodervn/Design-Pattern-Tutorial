package com.gpcoder.patterns.behavioral.state.trafficlight;

import java.util.concurrent.TimeUnit;

public class StatePatternExample {

	public static void main(String[] args) {

		TrafficLightContext trafficLight = new TrafficLightContext();
		
		while (true) {
			trafficLight.changeState();
			timer();
		}
	}

	private static void timer() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
