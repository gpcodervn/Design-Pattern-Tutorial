package com.gpcoder.patterns.behavioral.visitor.document;

public class XmlElement extends Element {

	public XmlElement(String uuid) {
		super(uuid);
	}

	public void accept(Visitor v) {
		v.visit(this);
	}
}