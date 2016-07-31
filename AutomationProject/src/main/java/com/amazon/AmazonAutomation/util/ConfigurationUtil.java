package com.amazon.AmazonAutomation.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationUtil {
	Properties prop;

	public ConfigurationUtil() {
		readProperties();
	}

	private void readProperties() {
		try {
			prop = new Properties();
			FileReader fr = new FileReader(new File("src\\main\\java\\com\\amazon\\AmazonAutomation\\util\\config.properties"));
			prop.load(fr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getProperty(String key) {
		String value = prop.getProperty(key);
		return value;
	}
}
