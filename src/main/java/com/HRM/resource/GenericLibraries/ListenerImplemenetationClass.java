package com.HRM.resource.GenericLibraries;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplemenetationClass implements ITestListener{
	 ExtentReports report1;
	 ExtentTest test;
	public void onTestStart(ITestResult result) {
		
		//execution start
		//configure the report
		String MethodName = result.getMethod().getMethodName();
		test=report1.createTest(MethodName);
		Reporter.log(MethodName+".....Testscript execution start");
		
				
		
	}

	public void onTestSuccess(ITestResult result) {
		
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.PASS,MethodName+"......executed successfully");
		Reporter.log(MethodName);
	}

	public void onTestFailure(ITestResult result) {
		
		
		
		String Failedscript = result.getMethod().getMethodName();
		String FScript=Failedscript+new JavaUtility().getSystemDateInFormat();
		EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.sdriver);
		File src=edriver.getScreenshotAs(OutputType.FILE);
		File dsc= new File(".\\screenshot\\"+FScript+".png");
		try
		{
			FileUtils.copyFile(src,dsc);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	
	}

	public void onTestSkipped(ITestResult result) {
	
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.SKIP,MethodName+"......skipped");
		test.log(Status.SKIP,result.getThrowable());
		Reporter.log(MethodName+"....skipped");
		
		
	}

	public void onStart(ITestContext context) {
		
		ExtentSparkReporter htmlreport = new ExtentSparkReporter(".\\ExtentReport\\report.html");
		htmlreport.config().setDocumentTitle("SDET 43 execution report");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("HRM execution report");
		
		report1 = new ExtentReports();
		
		 report1.attachReporter(htmlreport);
		 report1.setSystemInfo("base browser", "chrome");
		 report1.setSystemInfo("os", "windows");
		 report1.setSystemInfo("base url", "http://rmgtestingserver/domain/HRM_System/");
		 report1.setSystemInfo("reporter name", "amrutha");
		 
			}

	public void onFinish(ITestContext context) {
		
		//consolidate all the report
		report1.flush();
	} 
	
	

}
