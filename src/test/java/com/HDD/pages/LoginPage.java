package com.HDD.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(id="txtUsername") WebElement uname;
	@FindBy(id="txtPassword") WebElement pass;
	@FindBy(xpath="//*[@id=\"btnLogin\"]") WebElement login;
	
	public void loginCRM(String Username,String Password)
	{
	uname.sendKeys(Username);
	pass.sendKeys(Password);
	login.click();
	
}
}