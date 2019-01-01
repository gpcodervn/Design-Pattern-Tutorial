package com.gpcoder.patterns.behavioral.visitor.router;

/**
 * https://howtodoinjava.com/design-patterns/behavioral/visitor-design-pattern-example-tutorial/
 */
public class VisitorPatternExample {

	private static MacConfigurator macConfigurator;
	private static LinuxConfigurator linuxConfigurator;

	public static void main(String[] args) {
		macConfigurator = new MacConfigurator();
		linuxConfigurator = new LinuxConfigurator();
		testDlink();
		testTPLink();
		testLinkSys();
	}

	public static void testDlink() {
		DLinkRouter dlink = new DLinkRouter();
		dlink.accept(macConfigurator);
		dlink.accept(linuxConfigurator);
	}

	public static void testTPLink() {
		TPLinkRouter tplink = new TPLinkRouter();
		tplink.accept(macConfigurator);
		tplink.accept(linuxConfigurator);
	}

	public static void testLinkSys() {
		LinkSysRouter linksys = new LinkSysRouter();
		linksys.accept(macConfigurator);
		linksys.accept(linuxConfigurator);
	}
}
