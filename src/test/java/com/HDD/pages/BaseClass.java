package com.HDD.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.HDD.utilis.BrowserFactory;

public class BaseClass {
	
	public static WebDriver driver;

	@BeforeClass
	public static void initialization()
		{
			 driver=BrowserFactory.startAppliaction(driver, "chorme", "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			System.out.println(driver.getTitle());		
	}
	@AfterClass
	public void teardwon()
	{
	BrowserFactory.quitBrowser(driver);
	}
	
}
	


