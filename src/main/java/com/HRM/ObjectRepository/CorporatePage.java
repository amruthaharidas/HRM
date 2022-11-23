package com.HRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorporatePage {
	
	//declaration
	
		@FindBy(xpath="(//button[@type='button'])[1]")
		private WebElement addCorpButton;
		
		@FindBy(xpath="//input[@type=\"search\"]")
		private WebElement searchCorpButton;
		
		@FindBy(xpath="(//button[text()='Edit'])[1]")
		private WebElement editCorpLink;
		
		@FindBy(xpath="(//button[text()='Delete'])[31]")
		private WebElement deletCorpLink;
		
		//initilization
		
		public CorporatePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		
		//utilization
		
		
		public WebElement getAddCorpButton() {
			return addCorpButton;
		}

		public WebElement getSearchCorpButton() {
			return searchCorpButton;
		}

		public WebElement getEditCorpLink() {
			return editCorpLink;
		}

		public WebElement getDeletCorpLink() {
			return deletCorpLink;
		}
		
		//buisiness library
		
		public void addCorporate()
		{
			addCorpButton.click();
		}
		
		public void editCorporate()
		{
			editCorpLink.click();
		}
		
		public void deletCorporate()
		{
			deletCorpLink.click();
		}
		
		
}


