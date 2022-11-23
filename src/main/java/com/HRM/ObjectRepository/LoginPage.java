package com.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRM.resource.GenericLibraries.WebDriverUtility;

public class LoginPage extends WebDriverUtility{
	
	
	//declaration
	
	
	@FindBy(name="hr_email")
	private WebElement emailEdit;
	

	@FindBy(name="hr_password")
	private WebElement passwordEdit;
	

	@FindBy(name="hr_type")
	private WebElement hrDropEdit;
	

	@FindBy(name="login_hr")
	private WebElement loginHr;
	

//initialization

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

//utilization

public WebElement getEmailEdit() {
	return emailEdit;
}


public WebElement getPasswordEdit() {
	return passwordEdit;
}


public WebElement getHrDropEdit() {
	return hrDropEdit;
}


public WebElement getLoginHr() {
	return loginHr;
}


public void hrLoginPage(String EMAIL,String PWD,WebDriverUtility wLib,WebDriver driver)
{
	emailEdit.sendKeys(EMAIL);
	passwordEdit.sendKeys(PWD);
	select(hrDropEdit,1);
	loginHr.click();
	wLib.acceptAlert(driver);
	
}

public void hrLoginAssisPage(String EMAIL1,String PWD1,WebDriverUtility wLib,WebDriver driver)
{
	emailEdit.sendKeys(EMAIL1);
	passwordEdit.sendKeys(PWD1);
	select(hrDropEdit,3);
	loginHr.click();
	wLib.acceptAlert(driver);
	
}

}
