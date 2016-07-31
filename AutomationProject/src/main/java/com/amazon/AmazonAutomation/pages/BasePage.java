package com.amazon.AmazonAutomation.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.AmazonAutomation.util.LocatorsUtil;
import com.amazon.AmazonAutomation.util.PageDriver;

public class BasePage {
	
	PageDriver driver;
	String SEARCH_TEXT_BOX = "css_SEARCH_TEXT_BOX";
	String SUBMIT_BUTTON = "css_SUBMIT_BUTTON";
	String SEARCH_LIST = "css_SEARCH_LIST";
	
	public BasePage(PageDriver driver) {
		this.driver = driver;
	}

	public List<WebElement> search(String searchTerm) {
		By temp = LocatorsUtil.get(SEARCH_TEXT_BOX);
		WebElement element = driver.findElement(temp);
		element.sendKeys(searchTerm);
		WebElement button = driver.findElement(LocatorsUtil.get(SUBMIT_BUTTON));
		button.submit();
		List<WebElement> searchList = driver.findElements(LocatorsUtil.get(SEARCH_LIST));
		return searchList;
	}

	public void login(String userId, String password) {
		Actions act = new Actions((WebDriver) driver.getDriver());
		WebElement yourAccount = driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		act.moveToElement(yourAccount);
		//WebElement signIn = driver.findElement(By.cssSelector(".nav-action-inner"));
		WebElement signIn = driver.findElement(By.xpath(".//*[@id='nav-flyout-ya-signin']"));
		act.moveToElement(signIn).click().perform();
		//WebElement email = driver.findElement(By.xpath(".//*[@id='ap_email']"));
		WebElement email = (new WebDriverWait(driver.getDriver(),40))
				  .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#ap_email")));
		//WebElement email = driver.findElement(By.cssSelector("#ap_email"));
		email.sendKeys(userId);
		WebElement pwd = driver.findElement(By.cssSelector("#ap_password"));
		pwd.sendKeys(password);
		WebElement signButton = driver.findElement(By.id("signInSubmit"));
		signButton.submit();
	}
	public void logOut(){
		Actions act = new Actions((WebDriver) driver.getDriver());
		WebElement yourAccount = driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		act.moveToElement(yourAccount);
		WebElement signOut = driver.findElement(By.xpath(".//*[@id='nav-item-signout']"));
		//JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);",signOut);
		act.moveToElement(signOut).click();

	}

	public void getDepartments(){
		Actions act = new Actions((WebDriver) driver.getDriver());
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement mainMenu = driver.findElement(By.cssSelector("#nav-link-shopall"));
		act.moveToElement(mainMenu);
		//longWait();
		WebElement subMenu = driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[12]/span"));
		act.moveToElement(subMenu);
		//longWait();
		//WebElement subMenuLink = driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[12]/div[2]/div/a[1]/span"));
		WebElement subMenuLink = driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[12]/div[1]/div/a[1]"));
		act.moveToElement(subMenuLink);
		//longWait();
		act.click().build().perform();
	}
	
	public void longWait() {
		long startTime = System.currentTimeMillis();
		int value = 999999999;
		while (value > 0) {
			value--;
		}
		value = 999999999;
		while (value > 0) {
			value--;
		}
		value = 999999999;
		while (value > 0) {
			value--;
		}
		System.out.println("Waited for "
				+ (System.currentTimeMillis() - startTime) + " milli seconds");
	}
	 
}
