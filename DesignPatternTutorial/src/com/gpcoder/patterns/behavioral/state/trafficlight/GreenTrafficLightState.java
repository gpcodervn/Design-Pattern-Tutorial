package com.gpcoder.patterns.behavioral.state.trafficlight;

public class GreenTrafficLightState extends State {

	private TrafficLightContext trafficLight;

	public GreenTrafficLightState(TrafficLightContext trafficLight) {
		this.trafficLight = trafficLight;
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning traffic light to yellow.");
		trafficLight.setState(trafficLight.getYellowLightState());
	}

	public String toString() {
		return "Traffic light is green.";
	}
}
