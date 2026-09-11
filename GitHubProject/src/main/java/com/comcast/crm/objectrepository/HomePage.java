package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(linkText ="Organizations")
	private WebElement OrganizationLink;
	
	@FindBy(xpath  ="//img[@src='themes/softed/images/user.PNG']")
	private WebElement Administratoricon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement SignOutlink;
	
	@FindBy(linkText = "Products")
	private WebElement Productslink;
	
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrganizationLink() {
		return OrganizationLink;
	}

	public WebElement getAdministratoricon() {
		return Administratoricon;
	}
	
	
	public WebElement getSignOutlink() {
		return SignOutlink;
	}

	public WebElement getProductslink() {
		return Productslink;
	}

	public void logOut()
	{
		Actions ac = new Actions(driver);
		ac.moveToElement(Administratoricon).perform();
	    SignOutlink.click();
		
	}
	
	

}
