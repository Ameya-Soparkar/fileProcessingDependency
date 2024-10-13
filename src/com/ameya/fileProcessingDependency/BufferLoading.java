package com.ameya.fileProcessingDependency;

import java.io.BufferedReader;
import java.io.FileReader ;
import java.io.IOException;

public class BufferLoading{
	
	public static void main(String[] args) throws IOException {
		
		FileReader filer = new FileReader("C:\\Users\\ADMIN\\Downloads\\user_behavior_dataset.csv");
		
		BufferedReader bufferr = new BufferedReader(filer);
		System.out.println(bufferr.readLine());
	
	
	}

}
