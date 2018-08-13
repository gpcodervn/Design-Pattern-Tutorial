package com.gpcoder.solid;

/**
 * LSP - Liskov substitution principle example
 * 
 * @author gpcoder
 */
interface FileService {
	void getFiles();
	void deleteFiles();
}

class ImageFileService implements FileService {

	@Override
	public void getFiles() {
		// Load image files
	}

	@Override
	public void deleteFiles() {
		// Delete image files
	}
}

class TempFileService implements FileService {

	@Override
	public void getFiles() {
		// Load temp files
	}

	@Override
	public void deleteFiles() {
		// Delete temp files
	}
}

class SystemFileService implements FileService {

	@Override
	public void getFiles() {
		// Load temp files
	}

	@Override
	public void deleteFiles() {
		throw new UnsupportedOperationException();
	}
}

public class LSPExample2 {

}
