package com.gpcoder.patterns.creational.prototype.computer;

public class Computer implements Cloneable {
	private String os;
	private String office;
	private String antivirus;
	private String browser;
	private String others;

	public Computer(String os, String office, String antivirus, String browser, String other) {
		super();
		this.os = os;
		this.office = office;
		this.antivirus = antivirus;
		this.browser = browser;
		this.others = other;
	}

	@Override
	protected Computer clone() {
		try {
			return (Computer) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String toString() {
		return "Computer [os=" + os + ", office=" + office + ", antivirus=" + antivirus + ", browser=" + browser
				+ ", others=" + others + "]";
	}

	public void setOthers(String others) {
		this.others = others;
	}
}
