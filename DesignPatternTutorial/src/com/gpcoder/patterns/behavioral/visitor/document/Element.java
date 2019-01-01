package com.gpcoder.patterns.behavioral.visitor.document;

public abstract class Element {
	
	protected String uuid;
	
	public Element(String uuid) {
		this.uuid = uuid;
	}

	public abstract void accept(Visitor v);
}
