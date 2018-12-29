package com.gpcoder.patterns.behavioral.templatemethod.game;

public class TemplateMethodPatternExample {

	public static void main(String[] args) {

		Game chess = new Chess();
		chess.play();

		Game football = new Football();
		football.play();
	}
}
