package com.HRM.ObjectRepository;

import javax.crypto.interfaces.DHPublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {

	@FindBy(xpath="(//button[@type='button'])[1]")
	private WebElement addEmpLink;
	
	@FindBy(xpath="//input[@type=\"search\"]")
	private WebElement empSeachText;
	

	@FindBy(xpath="(//i[@title=\"Delete Employee\"])[1]")
	private WebElement deleteEmp;
	
	@FindBy(xpath="//i[@class=\"fa fa-edit\"]")
	private WebElement editEmp;
	
	//initialization
	
	public EmployeePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddEmpLink() {
		return addEmpLink;
	}

	public WebElement getEmpSeachText() {
		return empSeachText;
	}

	public WebElement getDeleteEmp() {
		return deleteEmp;
	}
	
	public WebElement getEditEmp() {
		return editEmp;
	}

	//buisiness 
	
	
	
	public void searchEmpPage(String EmpName)
	{
		empSeachText.sendKeys(EmpName);
	}
	public void employeePage()
	{
		addEmpLink.click();
	}
	
	public void deleteEmp()
	{
		deleteEmp.click();	
	}
	public void editAddEmp()
	{
		editEmp.click();	
	}
}
