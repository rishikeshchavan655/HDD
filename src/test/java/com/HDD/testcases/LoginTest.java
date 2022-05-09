package com.HDD.testcases;


import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import com.HDD.pages.BaseClass;
import com.HDD.pages.LoginPage;
import com.HDD.utilis.BrowserFactory;


public class LoginTest extends BaseClass {
	WebDriver driver;

	 @Test
	 public void LoginApp()
	 {
		 BaseClass.initialization();
		 LoginPage loginpage= PageFactory.initElements(driver,LoginPage.class);
		 loginpage.loginCRM("Admin","admin123");	
	 }
     
}
