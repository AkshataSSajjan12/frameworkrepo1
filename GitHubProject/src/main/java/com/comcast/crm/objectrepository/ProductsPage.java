package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	WebDriver driver;
	@FindBy(linkText = "Products")
	private WebElement Productslink;
	
	
	
	public ProductsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	public WebDriver getDriver() {
		return driver;
	}



	public WebElement getProductslink() {
		return Productslink;
	}
	


}
