package com.qa.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.freecrm.base.Base;

public class LoginPage extends Base {
	
	//PageFactory
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement Loginbtn;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement Loginbutton;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/a")
	WebElement Imgbtn;
	
	//Initializing the pageobjects
	public LoginPage()
	{
	PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validImagecrm()
	{
		return Imgbtn.isDisplayed();
	}
	
	public HomePage validateLogin(String un,String pwd)
	{
		email.sendKeys(un);
		password.sendKeys(pwd);
		Loginbutton.click();
		return new HomePage();
	}

}
