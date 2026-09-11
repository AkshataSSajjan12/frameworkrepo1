package com.comcast.crm.objectrepository;

import java.security.Provider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	//declere webelement
	@FindBy(name="user_name")
	private  WebElement UserNameTextfield;
	
	@FindBy(name="user_password")
	private  WebElement PasswordTextfield;
	
	@FindBy(id="submitButton")
	private  WebElement LoginButton;
	
	//initilization webelement
	WebDriver driver ;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}
    
	//Provider getters
	public WebElement getUserNameTextfield() {
		return UserNameTextfield;
	}

	public WebElement getPasswordTextfield() {
		return PasswordTextfield;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	//provide actions(business libraries it is used for that particule=r application)
	public void toGetLoginapp(String username, String password)
	{
		UserNameTextfield.sendKeys(username);
		PasswordTextfield.sendKeys(password);
		LoginButton.click();
	}
	
	
	
	
	
	
	

}
