package com.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRM.resource.GenericLibraries.WebDriverUtility;

public class editAddEmpPage {
	@FindBy(xpath="(//input[@type=\"text\"])[187]")
	private WebElement compid;
	
	@FindBy(xpath="(//div[@class=\"modal-header\"])[34]")
	private WebElement editemp;
	
	@FindBy(xpath="(//button[@type=\"submit\"])[34]")
	private WebElement updateEdit;
	
	//initilization
	
	public editAddEmpPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	
	public WebElement getCompanyId() {
		return compid;
	}

	public WebElement getEditEmpPage() {
		return editemp;
	}

	public WebElement getUpdateEdit() {
		return updateEdit;
	}
	
	//buisiness lib
	
	public void editCompId(String Id,WebDriverUtility wLib,WebDriver driver) throws Throwable
	{
		compid.clear();
		compid.sendKeys(Id);
		editemp.click();
		
		wLib.enterPageDown(driver);
		wLib.enterPageDown(driver);
		wLib.enterPageDown(driver);
		wLib.enterPageDown(driver);
		wLib.enterPageDown(driver);
		wLib.enterPageDown(driver);
		wLib.enterPageDown(driver);
		wLib.enterPageDown(driver);
		wLib.enterPageDown(driver);
		updateEdit.click();
	}
}
