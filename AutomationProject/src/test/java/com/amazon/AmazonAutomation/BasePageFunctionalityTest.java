package com.amazon.AmazonAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.AmazonAutomation.pages.BasePage;

public class BasePageFunctionalityTest extends BasePageTest {

	@Test 
	public void searchTest() {
		BasePage bp = new BasePage(driver);
		String searchTerm = "iphone";
		List<WebElement> searchList = bp.search(searchTerm);
		Assert.assertTrue(searchList.size() > 0);
		Assert.assertTrue(searchList.size() > 0);
	}

	@Test
	public void searchNoResultTest() {
		BasePage bp = new BasePage(driver);
		String searchTerm = "grrfgfghffhghhgerthr";
		List<WebElement> searchList = bp.search(searchTerm);
		Assert.assertTrue(searchList.size() == 0);
	}
	
    @Test(enabled=false)
	public void loginTest(){
		BasePage bp = new BasePage(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    bp.login("testexample84@gmail.com","testtest1234");
	    String actualText = driver.findElement(By.cssSelector("#nav-link-yourAccount")).getText();
	    Assert.assertTrue(actualText.contains("Test"));
	}

    @Test(priority =0)
    public void loginAndLogOutTest(){
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       	BasePage bp = new BasePage(driver);
        bp.login("testexample84@gmail.com","testtest1234");
	    String newText = driver.findElement(By.cssSelector("#nav-link-yourAccount")).getText();
	    Assert.assertTrue(newText.contains("Test"));
    	bp.logOut();
    	WebElement actualText = (new WebDriverWait(driver.getDriver(),40))
				  .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#ap_email")));
       	//String actualText = driver.findElement(By.cssSelector("#ap_email")).getText();
    	Assert.assertNull(actualText);
    }
	
	@Test
	public void getDepartmentsTest(){
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		BasePage page = new BasePage(driver);
		page.getDepartments();
		String expectedTitle ="Televisions";
		//String pageTitle = driver.findElement(By.xpath(".//*[@id='hybridBrowse']")).getText();
		String pageTitle = driver.findElement(By.cssSelector(".acs-bgh1-header")).getText();
		Assert.assertTrue(pageTitle.contains(expectedTitle));
	}

}
