package com.amazon.AmazonAutomation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.AmazonAutomation.pages.HomePage;

public class HomePageTest extends BasePageTest {
	
	@Test
	public void addCookiesTest() {
		HomePage page = new HomePage(driver);
		String cookieName = "myCookie";
		String cookieValue = "012345678910";
		page.addCookies(cookieName, cookieValue);
		Assert.assertEquals(cookieValue, page.getCookieValue(cookieName));
	}

	@Test
	public void captureScreenShotTest() throws IOException {
		try {
			HomePage page = new HomePage(driver);
			page.failMethod("http://www.amazon.com");
		} catch (Exception e) {
			HomePage homePage1 = new HomePage(driver);
			homePage1.captureScreenShot("C:\\Users\\arpitadeepak\\Desktop\\Screenshot.png");
		}
	}

	@Test
	public void switchToFrameTest() {
		HomePage page = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriver iframePageDriver = page.switchToFrame("//*[@id=\"ape_Gateway_right-2_desktop_placement\"]/iframe");
		WebElement iframeElement = iframePageDriver.findElement(By.id("div-gpt-ad"));
		Assert.assertNotNull(iframeElement);
	}
	
	@Test
	public void  checkTitleTest(){
		HomePage page = new HomePage(driver);
		String title= page.checkTitle();
		String expectedTitle ="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		Assert.assertEquals(title,expectedTitle );
	}
}
