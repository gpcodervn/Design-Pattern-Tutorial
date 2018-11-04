package com.gpcoder.patterns.structural.composite;

import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		FileComponent file1 = new FileLeaf("file 1", 10);
		FileComponent file2 = new FileLeaf("file 2", 5);
		FileComponent file3 = new FileLeaf("file 3", 12);

		List<FileComponent> files = Arrays.asList(file1, file2, file3);
		FileComponent folder = new FolderComposite(files);
		folder.showProperty();
		System.out.println("Total Size: " + folder.totalSize());
	}
}
