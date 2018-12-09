package com.gpcoder.patterns.behavioral.mediator.trafficlight;

public class TrafficLightApp {
	public static void main(String[] args) {

		LightMediator lightMediator = new LightMediator();
		Light red = new Light("Red", lightMediator);
		Light green = new Light("Green", lightMediator);
		Light yellow = new Light("Yellow", lightMediator);

		red.turnOn();
		green.turnOn();
		yellow.turnOn();
	}
}
