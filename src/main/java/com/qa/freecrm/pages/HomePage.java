package com.qa.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.freecrm.base.Base;

public class HomePage extends Base {
	
	@FindBy(xpath="//button[text()='Create']")
	WebElement createbtn;
	
	@FindBy(name="first_name")
	WebElement firstname;
	
	@FindBy(name="middle_name")
	WebElement middlename;
	
	public HomePage()
	{
	PageFactory.initElements(driver, this);
	}
	
	

}
