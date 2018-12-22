package com.gpcoder.patterns.behavioral.observer.account;

public interface Subject {

	void attach(Observer observer);

	void detach(Observer observer);

	void notifyAllObserver();
}