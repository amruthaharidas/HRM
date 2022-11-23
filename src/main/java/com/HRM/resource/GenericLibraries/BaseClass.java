package com.HRM.resource.GenericLibraries;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public DataBaseUtility dLib=new DataBaseUtility();
	public FileUtility fLib=new FileUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public JavaUtility jLib=new JavaUtility();
	public WebDriverUtility wLib=new WebDriverUtility();
	
	public WebDriver driver;
	public static WebDriver sdriver;
	
	@BeforeSuite
	
	public void connectToDb() throws SQLException
	{
		dLib.connectionToDB();
		System.out.println("connect to the database");
		
	}
	
	
//	@Parameters("BROWSER")
	@BeforeClass
	
	public void launchBrowser() throws IOException
	{
		String BROWSER=fLib.ReadDataFromPropertyFile("browser");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
	        driver=new FirefoxDriver();
		}
       else
       {
	    System.out.println("invalid browser");
	   }
		
		sdriver=driver;
		wLib.maximiseWindow(driver);
		wLib.waitForPageLoad(driver);
		String URL=fLib.ReadDataFromPropertyFile("url");
		
		driver.get(URL);
	}
	
	@AfterClass
	
	public void closeBrowser()

	{
		driver.quit();
		System.out.println(".......close the browser.....");
		
	}
	
	@AfterSuite
	
	public void closeDB() throws SQLException
	{
		dLib.closeDB();
	}
	
	
	
	
}
