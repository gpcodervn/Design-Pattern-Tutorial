package com.gpcoder.patterns.behavioral.visitor.document;

import java.util.ArrayList;
import java.util.List;

public class Document extends Element {

	public Document(String uuid) {
		super(uuid);
	}

	private List<Element> elements = new ArrayList<>();

	public List<Element> getElements() {
		return elements;
	}

	@Override
	public void accept(Visitor v) {
		for (Element e : this.elements) {
			e.accept(v);
		}
	}
}