package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	WebDriver driver;
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement ClickOnPlusIconButton;
	
	@FindBy(name  = "search_text")
	private WebElement searchtextfield ;
	
	@FindBy(id = "bas_searchfield")
	private WebElement orgdropdown;
	
	@FindBy(name ="submit")
	private WebElement SearchnowButton;
	
	public OrganizationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getClickOnPlusIconButton() {
		return ClickOnPlusIconButton;
	}

	public WebElement getSearchtextfield() {
		return searchtextfield;
	}

	public WebElement getOrgdropdown() {
		return orgdropdown;
	}

	public WebElement getSearchnowButton() {
		return SearchnowButton;
	}
	
	
	
	

}
