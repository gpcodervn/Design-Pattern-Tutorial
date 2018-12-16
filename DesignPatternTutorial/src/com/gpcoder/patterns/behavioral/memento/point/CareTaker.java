package com.gpcoder.patterns.behavioral.memento.point;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {

	private final Map<String, Memento> savepointStorage = new HashMap<>();

	public void saveMemento(Memento memento, String savedPointName) {
		System.out.println("Saving state..." + savedPointName);
		savepointStorage.put(savedPointName, memento);
	}

	public Memento getMemento(String savedPointName) {
		System.out.println("Undo at ..." + savedPointName);
		return savepointStorage.get(savedPointName);
	}

	public void clearSavepoints() {
		System.out.println("Clearing all save points...");
		savepointStorage.clear();
	}
}