package com.HRM.ObjectRepository;

import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.HRM.resource.GenericLibraries.WebDriverUtility;

public class AddEmployeePage {

	@FindBy(name="employee_companyid")
	private WebElement employeeid;
	
	@FindBy(name="employee_firstname")
	private WebElement employeeFirstName;
	
	@FindBy(name="employee_lastname")
	private WebElement employeeLastName;
	
	@FindBy(name="employee_middlename")
	private WebElement employeeMiddleName;
	
	@FindBy(name="branches_datefrom")
	private WebElement branchesDateFrom;
	
	@FindBy(name="branches_recentdate")
	private WebElement branchesRecentdate;
	
	
	@FindBy(name="employee_position")
	private WebElement employeePosition;
	
	@FindBy(name="eemployee_contact")
	private WebElement employeeContact;
	
	@FindBy(name="employee_sss")
	private WebElement employeesss;
	
	@FindBy(name="employee_tin")
	private WebElement employeeTin;
	
	@FindBy(name="employee_hdmf_pagibig")
	private WebElement employeehdmf;
	
	
	@FindBy(name="employee_gsis")
	private WebElement employeegsis;
	
	@FindBy(name="employee_department")
	private WebElement employeeDepartment;
	
	
	@FindBy(name="employee_branches")
	private WebElement employeeBranches;
	
	@FindBy(xpath="(//div[@class=\"modal-header\"])[1]")
	private WebElement webPageClick;
	
	@FindBy(name="employee_image")
	private WebElement employeeImage;
	
	@FindBy(name="employee_file201")
	private WebElement employeefile;
	

	@FindBy(xpath="(//button[@type=\"submit\"])[1]")
	private WebElement saveButton;
	
	
	//initilization
	
		public AddEmployeePage (WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		public WebElement getEmployeeid() {
			return employeeid;
		}

		public WebElement getEmployeeFirstName() {
			return employeeFirstName;
		}

		public WebElement getEmployeeLastName() {
			return employeeLastName;
		}

		public WebElement getEmployeeMiddleName() {
			return employeeMiddleName;
		}

		public WebElement getBranchesDateFrom() {
			return branchesDateFrom;
		}

		public WebElement getBranchesRecentdate() {
			return branchesRecentdate;
		}

		public WebElement getEmployeePosition() {
			return employeePosition;
		}

		public WebElement getEmployeeContact() {
			return employeeContact;
		}

		public WebElement getEmployeesss() {
			return employeesss;
		}

		public WebElement getEmployeeTin() {
			return employeeTin;
		}

		public WebElement getEmployeehdmf() {
			return employeehdmf;
		}

		public WebElement getEmployeegsis() {
			return employeegsis;
		}

		public WebElement getEmployeeDepartment() {
			return employeeDepartment;
		}
	
		
		public WebElement getEmployeeBranches() {
			return employeeBranches;
			
		}

		public WebElement getWebPageClick() {
			return webPageClick;
		}
		public WebElement getEmployeeImage() {
			return employeeImage;
		}
		public WebElement getEployeefile() {
			return employeefile;
		}
		
		public WebElement getSaveButton() {
			return saveButton;
		}
		
	
		public void addEmployee(Map<String,String>map,WebDriverUtility wLib,WebDriver driver,String branch,String image,String file) throws Throwable
		{
						
			for(Entry<String,String> set:map.entrySet())
			{
				driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
			}
			
			
			wLib.select(employeeDepartment, 1);
			wLib.select(employeeBranches,1);
			webPageClick.click();
			
			wLib.enterPageDown(driver);
			wLib.enterPageDown(driver);
			wLib.enterPageDown(driver);
			wLib.enterPageDown(driver);
			wLib.enterPageDown(driver);
			wLib.enterPageDown(driver);
			wLib.enterPageDown(driver);
			wLib.enterPageDown(driver);
			wLib.enterPageDown(driver);
			 
			employeeImage.sendKeys(image);
			employeefile.sendKeys(file);
			saveButton.click();
			
			
		}
	
}
