package com.ameya.fileProcessingDependency;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Reading file");
				
		LoadingFile obj1 = new LoadingFile(new ScannerLoading());
		
		String filePath = "C:\\Users\\ADMIN\\Downloads\\user_behavior_dataset.csv";
        
        obj1.readCsv(filePath);
        
        System.out.println("Done");
     }
}

