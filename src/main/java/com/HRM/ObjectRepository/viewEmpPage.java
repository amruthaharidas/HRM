package com.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class viewEmpPage {

	@FindBy(name="employee_department")
	private WebElement empDeptClick;
	
	//initilization
	
		public viewEmpPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		//utilization
		
		public WebElement getEmpDeptClick() {
			return empDeptClick;
		}
		
		//buisiness library
		
		public void viewEmpDepartment()
		{
			empDeptClick.click();
		}
}
