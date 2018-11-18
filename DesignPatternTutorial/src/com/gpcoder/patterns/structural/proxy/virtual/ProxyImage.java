package com.gpcoder.patterns.structural.proxy.virtual;

public class ProxyImage implements Image {
	private Image realImage;
	private String url;

	public ProxyImage(String url) {
		this.url = url;
		System.out.println("Image unloaded: " + this.url);
	}

	@Override
	public void showImage() {
		if (realImage == null) {
			realImage = new RealImage(this.url);
		} else {
			System.out.println("Image already existed: " + this.url);
		}
		realImage.showImage();
	}
}