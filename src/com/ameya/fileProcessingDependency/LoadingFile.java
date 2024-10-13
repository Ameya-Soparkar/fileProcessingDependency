package com.ameya.fileProcessingDependency;


public class LoadingFile {
	
	private Loader scanload;
	
	public LoadingFile(Loader scanload) {
		this.scanload = scanload;
		}
	
	public void readCsv(String filePath) {
		scanload.readCsv(filePath);
	}

}
