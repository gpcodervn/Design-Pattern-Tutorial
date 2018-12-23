package com.gpcoder.patterns.behavioral.state.trafficlight;

public class TrafficLightContext {

	private State red;
	private State yellow;
	private State green;
	private State state;

	public TrafficLightContext() {
		red = new RedTrafficLightState(this);
		yellow = new YellowTrafficLightState(this);
		green = new GreenTrafficLightState(this);

		state = red;
	}

	public void changeState() {
		state.handleRequest();
	}

	public String toString() {
		return state.toString();
	}

	public State getGreenLightState() {
		return green;
	}

	public State getYellowLightState() {
		return yellow;
	}

	public State getRedLightState() {
		return red;
	}

	public void setState(State state) {
		this.state = state;
	}
}