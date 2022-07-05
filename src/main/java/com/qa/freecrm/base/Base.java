
package com.qa.freecrm.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.freecrm.utils.Util;

public class Base {
	
    public static WebDriver driver;
    public static Properties prop;
     
     public Base() {
    	 try {
    	 prop=new Properties();
    	 FileInputStream ip=new FileInputStream("C:\\Users\\MANMDHA KUMAR\\eclipse-workspace\\Automation_java\\src\\main\\java\\com\\qa\\freecrm\\config\\config.properties");
    	 prop.load(ip);
    	 }
    	 catch(FileNotFoundException e) {
    		 e.printStackTrace();
    	 }catch(Exception e) {
    	 e.printStackTrace();
}
     }
     
     public static void initialization()
     {
    	String browserName= prop.getProperty("browser");
    	if(browserName.equalsIgnoreCase("chrome")) {
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANMDHA KUMAR\\Documents\\chromedriver");
    		driver=new ChromeDriver();
    	}
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(Util.PAGELOADTIME_WAIT, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
 
    	driver.get(prop.getProperty("url"));
     }
}
