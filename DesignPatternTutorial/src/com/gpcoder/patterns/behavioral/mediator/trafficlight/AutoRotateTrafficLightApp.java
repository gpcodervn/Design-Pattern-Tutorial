package com.gpcoder.patterns.behavioral.mediator.trafficlight;

import java.util.concurrent.TimeUnit;

public class AutoRotateTrafficLightApp {
	
	public static void main(String[] args) {

		LightMediator lightMediator = new LightMediator();
		Light[] lights = {
				new Light("Red", lightMediator),
				new Light("Green", lightMediator),
				new Light("Yellow", lightMediator)
		};
		
		int currentLightIndex = 0;
		Light light;
		while (true) {
			if (currentLightIndex >= lights.length) {
				currentLightIndex = 0;
			}
			light = lights[currentLightIndex];
			light.turnOn();
			timer();
			currentLightIndex++;
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
