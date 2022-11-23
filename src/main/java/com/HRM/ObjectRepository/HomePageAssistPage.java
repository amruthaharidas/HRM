package com.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageAssistPage {
	
	//declaration
	@FindBy(xpath="(//a[@class=\"nav-link\"])[3]")
	private WebElement empAssistLink;
	

	@FindBy(xpath="(//a[@class=\"nav-link\"])[4]")
	private WebElement addEmpAssistLink;
	
	//initilization
	
	public HomePageAssistPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getEmpAssistLink() {
		return empAssistLink;
	}

	public WebElement getAddEmpLink() {
		return addEmpAssistLink;
	}
	
	public void homePageAssist()
	{
		empAssistLink.click();
		addEmpAssistLink.click();
		
	}
	
	
}
