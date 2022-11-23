package com.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRM.resource.GenericLibraries.WebDriverUtility;

public class editBranchPage {
	@FindBy(xpath="(//input[@type=\"text\"])[54]")
	private WebElement editBranchName;
	

	@FindBy(xpath="(//button[text()='Close'])[46]")
	private WebElement branchNameClose;
	
	@FindBy(xpath="(//button[@class=\"btn btn-primary\"])[29]")
	private WebElement branchUpdateLink;

	@FindBy(xpath="(//div[@class=\"modal-header\"])[46]")
	private WebElement editPageLink;

//initilization

public editBranchPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}


public WebElement getEditBranchName() {
	return editBranchName;
}


public WebElement getBranchNameClose() {
	return branchNameClose;
}


public WebElement getBranchUpdateLink() {
	return branchUpdateLink;
}

public WebElement getEditPageLink() {
	return editPageLink;
}

public void editBranchtext(String branch,WebDriver driver,WebDriverUtility wLib)
{
	editBranchName.clear();
	editBranchName.sendKeys(branch);
	//editPageLink.click();
	branchUpdateLink.click();
	wLib.acceptAlert(driver);
	
	
}


}
