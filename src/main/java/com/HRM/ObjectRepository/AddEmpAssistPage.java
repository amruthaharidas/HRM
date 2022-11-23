package com.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmpAssistPage {

	@FindBy(xpath="(//i[@title=\"View Employee\"])[1]")
	private WebElement viewEmpButton;
	
	//initilization
	
		public AddEmpAssistPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		//utilization
		public WebElement getViewEmpButton() {
			return viewEmpButton;
		}
		
		public void viewEmpData()
		{
			viewEmpButton.click();
		}
		
		
}
