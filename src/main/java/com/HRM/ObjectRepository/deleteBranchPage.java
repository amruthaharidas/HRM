package com.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRM.resource.GenericLibraries.WebDriverUtility;

public class deleteBranchPage {

	@FindBy(name="braches")
	private WebElement deleteButton;
	
	
	//initilization
	
	public deleteBranchPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

//utilization
	public WebElement getDeleteButton() {
		return deleteButton;
	}
	
	//buisiness library
	
	public void deletebranch(WebDriverUtility wLib,WebDriver driver)
	{
		deleteButton.click();	
		wLib.acceptAlert(driver);
	}
	
	
}
