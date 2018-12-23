package com.gpcoder.patterns.behavioral.state.trafficlight;

public class RedTrafficLightState extends State {
	 
    private TrafficLightContext trafficLight;
 
    public RedTrafficLightState(TrafficLightContext trafficLight) {
        this.trafficLight = trafficLight;
    }
 
    @Override
    public void handleRequest() {
        System.out.println("Turning traffic light to green...");
        trafficLight.setState(trafficLight.getGreenLightState());
    }
 
    public String toString() {
        return "Traffic light is on red.";
    }
}
