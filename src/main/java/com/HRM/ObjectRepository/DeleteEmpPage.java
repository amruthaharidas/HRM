package com.HRM.ObjectRepository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteEmpPage {

	//declaration

	@FindBy(name="delete3")
	private WebElement deletEmpLink;
	

	@FindBy(xpath="(//button[@type=\"button\"])[63]")
	private WebElement closeEmpLink;
	
	//initilization
	
	public DeleteEmpPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//utilization
	public WebElement getDeletEmpLink() {
		return deletEmpLink;
	}
	
	public WebElement getcloseEmpLink() {
		return closeEmpLink;
	}
	
	//buisiness
	
	public void deleteEmp()
	{
		deletEmpLink.click();
	}
	


	public void closeDelEmp() {
		closeEmpLink.click();
		
	}
	
	
}
