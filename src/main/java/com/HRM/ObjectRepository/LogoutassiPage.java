package com.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutassiPage {

	@FindBy(xpath="//i[@class=\"fa fa-user\"]")
	private WebElement logoutaLink;
	

	@FindBy(xpath="(//a[@class=\"dropdown-item\"])[2]")
	private WebElement logoutaClick;
;
	
	//initilization
	
	public LogoutassiPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getLogoutLink() {
		return logoutaLink;
	}

	public WebElement getLogoutClick() {
		return logoutaClick;
	}
	
	public void logoutassi()
	{
		logoutaLink.click();
		logoutaClick.click();
	}
}
