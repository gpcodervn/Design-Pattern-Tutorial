package com.gpcoder.patterns.behavioral.memento.state;

import java.util.ArrayList;
import java.util.List;

class Originator {
	private String state;

	public void set(String state) {
		System.out.println("Originator: Setting state to " + state);
		this.state = state;
	}

	public Memento saveToMemento() {
		System.out.println("Originator: Saving to Memento.");
		return new Memento(this.state);
	}

	public void restoreFromMemento(Memento memento) {
		this.state = memento.getSavedState();
		System.out.println("Originator: State after restoring from Memento: " + state);
	}

	public static class Memento {
		private final String state;

		public Memento(String stateToSave) {
			state = stateToSave;
		}

		public String getSavedState() {
			return state;
		}
	}
}

class MementoExample {
	public static void main(String[] args) {
		List<Originator.Memento> savedStates = new ArrayList<>(); // caretaker

		Originator originator = new Originator();
		originator.set("State #1");
		originator.set("State #2");
		savedStates.add(originator.saveToMemento());
		originator.set("State #3");
		savedStates.add(originator.saveToMemento());
		originator.set("State #4");

		originator.restoreFromMemento(savedStates.get(1)); // This point need roll back
	}
}
