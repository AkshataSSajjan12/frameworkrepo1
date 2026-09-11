package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateOrganizationPage {
	
WebDriver driver;
	
	@FindBy(name = "accountname")
	private WebElement OrgnizationNameTextField;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement SaveButton;
	
	@FindBy(name = "industry")
	private WebElement Industrydropdown;
	
	@FindBy(name = "accounttype")
	private WebElement Typedropdown;
	
	
	
	
	public CreateOrganizationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrgnizationNameTextField() {
		return OrgnizationNameTextField;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}
	
	public WebElement getIndustrydropdown() {
		return Industrydropdown;
	}


	public void createorg(String orgname)
	{
		OrgnizationNameTextField.sendKeys(orgname);
		SaveButton.click();
		
	}
	public void createorg(String orgname, String industry)
	{
		OrgnizationNameTextField.sendKeys(orgname);
		Select sc = new Select(Industrydropdown);
		sc.selectByVisibleText(industry);
		
	}
	
	
	
	
	
	
	
	
	
	

}
