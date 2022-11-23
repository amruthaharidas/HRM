package com.HRM.resource.GenericLibraries;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtility {

	
	public void waitForPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void maximiseWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	
	public void waitForElementToBeVisible(WebDriver driver,WebElement element)
	{
		WebDriverWait  wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

	
	public void  select(WebElement element,int Index)
	   {  
		Select sel=new Select(element);
		sel.selectByIndex(Index);
	   }
	
	/**
	 * this method is used to handle dropdown using select by vale
	 * @param value
	 * @param element
	 */
	public void  select(String value,WebElement element)
   {  
	Select sel=new Select(element);
	sel.selectByValue(value);
   }
	
	/**
	 * this method is used to handle dropdown using visibletext
	 * @param element
	 * @param text
	 */
	public void  select(WebElement element,String text)
	   {  
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	   }
	
	/**
	 * 
	 * right click on web element
	 * @param driver
	 * @param element
	 */
	public void  rightClick(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	
	/**
	 * right click on web pages
	 * 
	 * @param driver
	 */
	
	public void  rightClick(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.contextClick().perform();
	}
	
	
	public void mouseOverOnElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void executeJavaScript(WebDriver driver,String javaSript)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript(javaSript,null);
		
	}
	
	/**
	 * double click on webelement
	 * 
	 * @param driver
	 * @param element
	 */
	
	public void doubleClickAction(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	/**
	 * double click on webpage
	 * @param driver
	 */
	
	public void doubleClickAction(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	/**
	 * enter keypress actio using action class
	 * @param driver
	 */
	public void enterKeyPress(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	
	public void enterKey(WebDriver driver)throws Throwable
	{
		
		Robot rb=new Robot();
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public void enterRelease(WebDriver driver)throws Throwable
	{
		
		Robot rb=new Robot();
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void enterPageDown(WebDriver driver)throws Throwable
	{
		
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
	
	
	public void switchToFrame(WebDriver driver,WebElement adress)
	{
		driver.switchTo().frame(adress);
	}
	
	public void switchToFrame(WebDriver driver,String nameOrID)
	{
		driver.switchTo().frame(nameOrID);
	}
	
	public void switchBackFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void cancelAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public void switchToWindow(WebDriver driver,String partialTitle)
	{
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while(it.hasNext())
		{
			String winId = it.next();
			String currentWinTitle = driver.switchTo().window(winId).getTitle();
			
			if(currentWinTitle.contains(partialTitle))
					{
					break;
					}
		}
	}
	
	public void dragAndDrop(WebDriver driver,WebElement src,WebElement dst)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src,dst).perform();
		
	}
	
	public void scrollBarAction(WebDriver driver)
	{

		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy(0,800)","");
		//js.executeAsyncScript(javaSript,null);
	}
	public void scrollAction(WebDriver driver,WebElement element)
	{

		JavascriptExecutor jse=(JavascriptExecutor)driver;
		int y=element.getLocation().getY();
		jse.executeScript("window.scrollBy(0,"+y+")",element);
		//js.executeAsyncScript(javaSript,null);
	}
	
	public void getScreenShot(WebDriver driver,String screenshotNAme) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path=".\\HRM\\photo\\.png";
		File dest=new File(path);
		Files.copy(src,dest);
	}
	
	public void getChildWindow(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
	}
	
	public void getWindow(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
	}
	public void chromeOptions()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
	}
	
	
}
