package script;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.HRM.ObjectRepository.AddBranchPage;
import com.HRM.ObjectRepository.AddCorporatePage;
import com.HRM.ObjectRepository.BranchPage;
import com.HRM.ObjectRepository.CorporatePage;
import com.HRM.ObjectRepository.HomePage;
import com.HRM.ObjectRepository.LoginPage;
import com.HRM.resource.GenericLibraries.BaseClass;
import com.HRM.resource.GenericLibraries.IPathConstants;

@Listeners(com.HRM.resource.GenericLibraries.ListenerImplemenetationClass.class)
public class BranchCorporateTestng extends BaseClass {

	
	@Test(groups="smoke")
	
	public void branchCorporate() throws InterruptedException, IOException, AWTException, EncryptedDocumentException, InvalidFormatException
	{
		
		
		String EMAIL=fLib.ReadDataFromPropertyFile("email");
		String PWD=fLib.ReadDataFromPropertyFile("pwd");
		Robot r=new Robot();		

		//login
		 
		 
		LoginPage lp=new LoginPage(driver);
		lp.hrLoginPage(EMAIL,PWD,wLib,driver);
		
		
		//read from excel

		FileInputStream fi =new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet("sheet2");
		String branch=eLib.readDataFromExcel("sheet2", 1, 0);
		String corp=eLib.readDataFromExcel("sheet2", 1, 1);
		System.out.println(branch);
		System.out.println(corp);
		
	
		
		
		//branch module
		 HomePage hp=new HomePage(driver);
		 
		 hp.branchClick();
			Thread.sleep(2000);
		//adding branch
		 
		 BranchPage bp=new BranchPage(driver);
		 bp.addBranch();
		 Assert.fail();
		 AddBranchPage ap=new AddBranchPage(driver);
		 ap.addBranchName(branch);
		 
		 //Assertions
		 
		 SoftAssert sa=new SoftAssert();
		 sa.assertEquals(branch, "chennai");
		 
		 wLib.acceptAlert(driver);
		 
			Thread.sleep(2000);
		//corporate
		 
		
		 hp.corporateClick();
		 
		 CorporatePage cp=new CorporatePage(driver);
		 cp.addCorporate();
		 
		 //add corporate
		 
		 AddCorporatePage ac=new AddCorporatePage(driver);
		 ac.addCorpName(corp, wLib, driver);
		 
		 //eLib.getList(corp, driver);
		 
	}
	
	@Test(groups="smoke")
	public void test()
	{
		System.out.println("println new");
	}
	
	
}
