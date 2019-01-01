package com.gpcoder.patterns.behavioral.visitor.document;

public class JsonElement extends Element {

	public JsonElement(String uuid) {
		super(uuid);
	}

	public void accept(Visitor v) {
		v.visit(this);
	}
}