package com.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BranchPage {
	
	//declaration
	
			@FindBy(xpath="(//button[@type=\"button\"])[1]")
			private WebElement addBranchButton;
			
			@FindBy(xpath="//input[@type=\"search\"]")
			private WebElement searchBranchButton;
			
			@FindBy(xpath="(//button[text()='Edit'])[1]")
			private WebElement editBranchLink;
			
			@FindBy(xpath="(//button[text()='Delete'])[24]")
			private WebElement deleteBranchLink;
			
			//initilization
			
			public BranchPage(WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}
			
			//utilization

			public WebElement getAddBranchButton() {
				return addBranchButton;
			}

			public WebElement getSearchBranchButton() {
				return searchBranchButton;
			}

			public WebElement getEditBranchLink() {
				return editBranchLink;
			}

			public WebElement getDeleteBranchLink() {
				return deleteBranchLink;
			}
			
			
			//buisiness library
			
			
			public void addBranch()
			{
				addBranchButton.click();
			}
			
			public void editBranch()
			{
				editBranchLink.click();
			}
			
			public void deletBranch()
			{
				deleteBranchLink.click();
			}

}
