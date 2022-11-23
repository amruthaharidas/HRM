package com.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBranchPage {
	
	//declaration 
	
	@FindBy(name="branches_name")
	private WebElement branchNameText;
	

	@FindBy(xpath="(//button[text()='Close'])[1]")
	private WebElement branchNameClose;
	
	@FindBy(xpath="(//button[text()='Save'])")
	private WebElement branchLink;
	
	//initialization
	
	public AddBranchPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//utilization
	
	public WebElement getBranchNameText() {
		return branchNameText;
	}

	public WebElement getBranchNameClose() {
		return branchNameClose;
	}

	public WebElement getBranchLink() {
		return branchLink;
	}
	
	
	//buisiness library
	
	public void addBranchName(String branch)
	{
		branchNameText.sendKeys(branch);
		branchLink.click();
		
	}
	
	
	
	
	

}
