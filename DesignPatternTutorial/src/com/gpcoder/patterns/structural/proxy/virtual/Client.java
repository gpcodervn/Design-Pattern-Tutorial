package com.gpcoder.patterns.structural.proxy.virtual;

public class Client {
	public static void main(String[] args) {
		System.out.println("Init proxy image: ");
		ProxyImage proxyImage = new ProxyImage("http://gpcoder.com/favicon.ico");
		
		System.out.println("---");
		System.out.println("Call real service 1st: ");
		proxyImage.showImage();
		
		System.out.println("---");
		System.out.println("Call real service 2nd: ");
		proxyImage.showImage();
	}
}
