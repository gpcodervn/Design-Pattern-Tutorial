package com.gpcoder.patterns.behavioral.observer.youtube;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChanel {
	private List<Viewer> viewers = new ArrayList<>();
	private String chanelName;

	public String getChanelName() {
		return chanelName;
	}

	public YoutubeChanel(String chanelName) {
		this.chanelName = chanelName;
	}

	public void publishAVideo() {
		notifyAllSubscribers();
	}

	public void subscribe(Viewer observer) {
		if (!viewers.contains(observer))
			viewers.add(observer);
	}

	public void unsubscribe(Viewer observer) {
		if (viewers.contains(observer)) {
			viewers.remove(observer);
		}
	}

	private void notifyAllSubscribers() {
		for (Viewer observer : viewers) {
			observer.update();
		}
	}

}