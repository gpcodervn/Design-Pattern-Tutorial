package com.gpcoder.patterns.behavioral.observer.youtube;

public class ObserverPatternExample {

	public static void main(String[] args) {

		YoutubeChanel myChanel = new YoutubeChanel("GPCoder");

		Viewer natasha = new Viewer("natasha", myChanel);
		Viewer hugo = new Viewer("hugo", myChanel);
		Viewer hinata = new Viewer("hinata", myChanel);
		Viewer naruto = new Viewer("naruto", myChanel);

		myChanel.publishAVideo();
	}
}
