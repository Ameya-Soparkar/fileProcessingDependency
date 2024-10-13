package com.ameya.fileProcessingDependency;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerLoading implements Loader {

	@Override
	public void readCsv(String filePath) {
		Scanner sc = null;

		try {
			sc = new Scanner(new File(filePath));
			sc.useDelimiter(",");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}