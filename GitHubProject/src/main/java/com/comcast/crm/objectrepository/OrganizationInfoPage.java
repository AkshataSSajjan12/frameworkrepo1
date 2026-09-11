package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {
	
	@FindBy(className  = "dvHeaderText")
	private WebElement Orgnizationinfo;
	
	public OrganizationInfoPage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgnizationinfo() {
		return Orgnizationinfo;
	}
	
	

}
