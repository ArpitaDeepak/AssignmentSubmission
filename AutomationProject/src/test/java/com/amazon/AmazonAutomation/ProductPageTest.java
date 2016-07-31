package com.amazon.AmazonAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.AmazonAutomation.pages.ProductPage;

public class ProductPageTest extends BasePageTest{
  
	@Test
	public void addToCartTest() {
		ProductPage page = new ProductPage(driver);
		WebElement cartCountElement = page.addToCart("iphone");
		int cartCount = Integer.parseInt(cartCountElement.getText());
		Assert.assertTrue(cartCount > 0);
	}

	@Test
	public void clearCart() {
		ProductPage page = new ProductPage(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		page.addToCart("ipad");
		page.addToCart("iphone");
		WebElement cartElement = page.clearCart();
		page.longWait();
		int cartCount = Integer.parseInt(cartElement.getText());
		Assert.assertTrue(cartCount == 0);
	}

	
}
