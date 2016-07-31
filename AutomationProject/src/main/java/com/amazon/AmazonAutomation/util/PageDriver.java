package com.amazon.AmazonAutomation.util;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageDriver {

	public static String CHROME = "chrome";
	public static String INTERNET_EXPLORER = "ie";
	public static String FIREFOX = "firefox";

	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public PageDriver() {
		this.driver = new FirefoxDriver();
	}

	public PageDriver(String browserOption) {
		if (CHROME.equals(browserOption)) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\arpitadeepak\\selenium_drivers\\chromedriver.exe");
			this.driver = new ChromeDriver();
		} else if (INTERNET_EXPLORER.equals(browserOption)) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\arpitadeepak\\selenium_drivers\\IEDriverServer.exe");
			this.driver = new InternetExplorerDriver();
		} else {
			this.driver = new FirefoxDriver();
		}
	}

	public WebElement findElement(By cssSelector) {
		return driver.findElement(cssSelector);
	}

	public void openUrl(String url) {
		driver.get(url);
	}

	public void closeUrl() {
		driver.close();
	}

	public java.util.List<WebElement> findElements(By id) {
		return driver.findElements(id);
	}

	public Options manage() {
		return driver.manage();
	}

	public void waitForTime(long timeOutInSeconds, By locator) {
		WebDriverWait webDriverWait = new WebDriverWait(driver,
				timeOutInSeconds);
		webDriverWait.withTimeout(timeOutInSeconds, TimeUnit.MILLISECONDS);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public String getCookieValue(String cookieName) {
		Set<Cookie> cookieList =  driver.manage().getCookies();
		for(Cookie cookie : cookieList){
			if(cookieName.equals(cookie.getName())){
				return cookie.getValue();
			}
		}
		return "";
	}

	public TargetLocator switchTo() {
		return driver.switchTo();
	}

}
