package com.qa.freecrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.freecrm.base.Base;
import com.qa.freecrm.pages.HomePage;
import com.qa.freecrm.pages.LoginPage;

public class LoginPageTest extends Base {
	
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		 loginpage=new LoginPage();
	}
	@Test(priority=1)
	public void validateLoginPageTest()
	{
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Free CRM software for customer relationship management, sales, marketing campaigns and support.");
	}
	
	@Test(priority=2)
	public void validateImageLogo()
	{
	boolean flog= loginpage.validImagecrm();
	Assert.assertTrue(flog);
	
	}
	
	@Test(priority=3)
	public void loginTest()
	{
	homepage = loginpage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	
}
}