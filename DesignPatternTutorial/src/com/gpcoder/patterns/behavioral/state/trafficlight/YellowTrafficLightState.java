package com.gpcoder.patterns.behavioral.state.trafficlight;

public class YellowTrafficLightState extends State {

	private TrafficLightContext trafficLight;

	public YellowTrafficLightState(TrafficLightContext trafficLight) {
		this.trafficLight = trafficLight;
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning traffic light to red.");
		trafficLight.setState(trafficLight.getRedLightState());
	}

	public String toString() {
		return "Traffic light is yellow.";
	}
}
