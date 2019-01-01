package com.gpcoder.patterns.behavioral.visitor.document;

public interface Visitor {

	void visit(XmlElement xe);

	void visit(JsonElement je);
}
