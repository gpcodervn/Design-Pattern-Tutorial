package com.gpcoder.patterns.behavioral.visitor.document;

import java.util.UUID;

/**
 * https://www.baeldung.com/java-visitor-pattern
 */
public class VisitorPatternExample {

	public static void main(String[] args) {

		Visitor v = new ElementVisitor();

		Document d = new Document(generateUuid());
		d.getElements().add(new JsonElement(generateUuid()));
		d.getElements().add(new JsonElement(generateUuid()));
		d.getElements().add(new XmlElement(generateUuid()));

		d.accept(v);
	}

	private static String generateUuid() {
		return UUID.randomUUID().toString();
	}
}
