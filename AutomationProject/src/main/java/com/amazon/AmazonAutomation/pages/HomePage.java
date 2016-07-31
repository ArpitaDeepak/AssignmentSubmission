package com.amazon.AmazonAutomation.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amazon.AmazonAutomation.util.PageDriver;

public class HomePage extends BasePage {
		
	public HomePage(PageDriver driver) {
		super(driver);
	}

	public void addCookies(String cookieName, String cookieCode) {
		Cookie name = new Cookie(cookieName, cookieCode);
		driver.manage().addCookie(name);
	}

	public String getCookieValue(String cookieName) {

		return driver.getCookieValue(cookieName);
	}

	public void captureScreenShot(String path) throws IOException {
		TakesScreenshot shot = (TakesScreenshot) driver.getDriver();
		File src = shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));
	}

	public void failMethod(String url) throws Exception {
		driver.openUrl(url);
		throw new Exception();

	}

	public WebDriver switchToFrame(String frameXpath) {
		WebElement frame1 = driver.findElement(By.xpath(frameXpath));
		return driver.switchTo().frame(frame1);
	}

	public String checkTitle() {
		JavascriptExecutor exe = (JavascriptExecutor) driver.getDriver();
		String title = exe.executeScript("return document.title;").toString();
		return title;
	}

}
