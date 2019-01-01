package com.gpcoder.patterns.behavioral.visitor.document;

public class ElementVisitor implements Visitor {

	@Override
	public void visit(XmlElement xe) {
		System.out.println("processing an XML element with uuid: " + xe.uuid);
	}

	@Override
	public void visit(JsonElement je) {
		System.out.println("processing a JSON element with uuid: " + je.uuid);
	}
}