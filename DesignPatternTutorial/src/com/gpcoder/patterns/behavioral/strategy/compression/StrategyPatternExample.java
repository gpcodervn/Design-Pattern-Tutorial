package com.gpcoder.patterns.behavioral.strategy.compression;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class StrategyPatternExample {

	 public static void main(String[] args) {
		 List<File> files = new ArrayList<>();
		 
		 CompressionContext ctx = new CompressionContext();
		 ctx.setCompressionStrategy(new ZipCompressionStrategy());
		 ctx.createArchive(files);

		 ctx.setCompressionStrategy(new RarCompressionStrategy());
		 ctx.createArchive(files);
	 }
}
