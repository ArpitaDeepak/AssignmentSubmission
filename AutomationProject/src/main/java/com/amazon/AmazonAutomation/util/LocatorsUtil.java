package com.amazon.AmazonAutomation.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

import org.openqa.selenium.By;

public class LocatorsUtil {
	
	private static HashMap<String, String> locator;

	static{
		readLocators();
	}
	public static void readLocators() {
		Properties prop = new Properties();
		locator = new HashMap<String, String>();
		try {
			FileReader fr = new FileReader(new File("src\\main\\java\\com\\amazon\\AmazonAutomation\\util\\locators.properties"));
			try {
				prop.load(fr);
				for (Entry val : prop.entrySet()) {
					String key = (String) val.getKey();
					String value = (String) val.getValue();
					locator.put(key, value);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static By get(String key) {
		if (key.contains("_")) {
			String[] val = key.split("_");
			if (val[0].equals("css")) {
				return By.cssSelector(locator.get(key));
			} else if (val[0].equals("xpath")) {
				return By.xpath(locator.get(key));
			} else if (val[0].equals("id")) {
				return By.id(locator.get(key));
			} else if (val[0].equals("name")) {
				return By.name(locator.get(key));
			} else if (val[0].equals("tagname")) {
				return By.tagName(locator.get(key));
			} else if (val[0].equals("linkText")) {
				return By.linkText(locator.get(key));
			} else if (val[0].equals("partialLinkText")) {
				return By.partialLinkText(locator.get(key));
			} else if (val[0].equals("className")) {
				return By.className(locator.get(key));
			}
		}
		return By.cssSelector(locator.get(key));
	}
}
