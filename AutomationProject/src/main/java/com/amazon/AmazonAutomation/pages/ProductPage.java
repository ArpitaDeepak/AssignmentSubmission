package com.amazon.AmazonAutomation.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.amazon.AmazonAutomation.util.PageDriver;

public class ProductPage extends BasePage{

	private static final String NAV_CART_COUNT = "nav-cart-count";

	private ProductPage page;
	
	public ProductPage(PageDriver driver) {
		super(driver);
	}

	public WebElement addToCart(String searchTerm) {
		page = new ProductPage(driver);
		page.search(searchTerm);
		WebElement element = driver.findElement(By.xpath("//a[@class='a-link-normal s-access-detail-page  a-text-normal']"));
		element.click();
		WebElement cartButton = driver.findElement(By.cssSelector("#add-to-cart-button"));
		cartButton.submit();
		WebElement cartCountElement = driver.findElement(By.id("nav-cart-count"));
		return cartCountElement;
	}
	
	public WebElement clearCart() {
		WebElement element = driver.findElement(By.id(NAV_CART_COUNT));
		if (element.getText().equals("0")) {
			return element;
		} else {
			element.click();
			List<WebElement> list = driver.findElements(By.xpath("//input[@value='Delete']"));
			for (Iterator<WebElement> iterator = list.iterator(); iterator.hasNext();) {
				driver.waitForTime(1000, By.xpath("//input[@value='Delete']"));
				WebElement webElement = iterator.next();
				webElement.click();
			}
			longWait();
			return driver.findElement(By.id(NAV_CART_COUNT));
		}
	}

}
