package com.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRM.resource.GenericLibraries.WebDriverUtility;

public class LogoutPage {

	@FindBy(xpath="(//a[@class=\"nav-link\"])[2]")
	private WebElement logoutLink;
	

	@FindBy(xpath="(//a[@class=\"dropdown-item\"])[2]")
	private WebElement logoutClick;
	
	//initilization
	
	public LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getLogoutClick() {
		return logoutClick;
	}
	
	//buisiness library
	
	public void logoutpageHead(WebDriver driver,WebDriverUtility wLib) {
		
		logoutLink.click();
		logoutClick.click();
		wLib.acceptAlert(driver);
	}

}
