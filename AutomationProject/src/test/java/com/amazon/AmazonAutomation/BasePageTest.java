package com.amazon.AmazonAutomation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.amazon.AmazonAutomation.util.ConfigurationUtil;
import com.amazon.AmazonAutomation.util.PageDriver;

public class BasePageTest {
	public PageDriver driver;
	public static final ConfigurationUtil conf;
	
	static{
		conf = new ConfigurationUtil();
	}
	
	@BeforeMethod
	public void setUp() {
		driver = new PageDriver(conf.getProperty("BROWSER"));
		//driver = new PageDriver();
		driver.openUrl(conf.getProperty("URL"));
	}

	@AfterMethod
	public void tearDown() {
		driver.closeUrl();
		driver = null;
	}
}
