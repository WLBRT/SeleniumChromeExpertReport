package com.wam.utilswam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFileData {
	
	public ReadFileData() {}

	public static String Read(String pop) {
		String respo="";
		String FILENAME = "./config/config.properties";
		
		File file = new File(FILENAME);
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		respo = prop.getProperty(pop);
		return respo;
	}
}