package com.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	//declaration
	
	@FindBy(xpath="(//a[@class='nav-link'])[3]")
	private WebElement corporateLink;
	

	@FindBy(xpath="//p[text()='Add Corporate']")
	private WebElement addCorporateLink;
	
	@FindBy(xpath="(//a[@class='nav-link'])[5]")
	private WebElement branchLink;
	

	@FindBy(xpath="//p[text()='Add Braches']")
	private WebElement addBranchLink;
	
	@FindBy(xpath="(//i[@class='fas fa-angle-left right'])[3]")
	private WebElement empLink;
	

	@FindBy(xpath="//p[text()='Add Employee']")
	private WebElement addEmpLink;
	
	//initilization
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	//utilization
	
	public WebElement getCorporateLink() {
		return corporateLink;
	}

	public WebElement getAddCorporateLink() {
		return addCorporateLink;
	}

	public WebElement getBranchLink() {
		return branchLink;
	}

	public WebElement getAddBranchLink() {
		return addBranchLink;
	}

	public WebElement getEmpLink() {
		return empLink;
	}

	public WebElement getAddEmpLink() {
		return addEmpLink;
	}
	
	//Buisiness library
	
	public void corporateClick()
	{
		corporateLink.click();
		addCorporateLink.click();
	}
	


	public void branchClick()
	{
		branchLink.click();
		addBranchLink.click();
	}
	
	public void empClick()
	{
		empLink.click();
		addEmpLink.click();
	}
	
	
	
}
