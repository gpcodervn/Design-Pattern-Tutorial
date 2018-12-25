package com.gpcoder.patterns.behavioral.strategy.compression;

import java.io.File;
import java.util.List;

public class CompressionContext {

	private CompressionStrategy strategy;
	
	public void setCompressionStrategy(CompressionStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void createArchive(List<File> files) {
		strategy.compressFiles(files);
	}
}
