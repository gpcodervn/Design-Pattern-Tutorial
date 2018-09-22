package com.gpcoder.patterns.creational.prototype.computer;

public class ITApp {

	public static void main(String[] args) {
		Computer computer1 = new Computer("Window 10", "Word 2013", "BKAV", "Chrome v69", "Skype");
		Computer computer2 = computer1.clone();
		computer1.setOthers("Skype, Teamviewer, FileZilla Client");

		System.out.println(computer1);
		System.out.println(computer2);
	}
}
