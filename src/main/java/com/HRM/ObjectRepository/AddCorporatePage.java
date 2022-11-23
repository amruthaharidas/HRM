package com.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRM.resource.GenericLibraries.WebDriverUtility;

public class AddCorporatePage {

	//declaration 
	
		@FindBy(name="corporate_name")
		private WebElement corpNameText;
		
		
		@FindBy(xpath="//button[text()='Save']")
		private WebElement branchLink;
		
		//initialization
		
		public AddCorporatePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		public WebElement getCorpNameText() {
			return corpNameText;
		}

		public WebElement getBranchLink() {
			return branchLink;
		}
		
		public void addCorpName(String corp,WebDriverUtility wLib,WebDriver driver)
		{
			corpNameText.sendKeys(corp);
			branchLink.click();
			wLib.acceptAlert(driver);
			
		}
}
