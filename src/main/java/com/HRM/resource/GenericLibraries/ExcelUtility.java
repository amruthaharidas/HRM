package com.HRM.resource.GenericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.map.AbstractHashedMap;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mysql.cj.result.Row;
import net.bytebuddy.dynamic.scaffold.inline.AbstractInliningDynamicTypeBuilder;

public class ExcelUtility {
	
	public String readDataFromExcel(String SheetName,int RowNo,int ColoumNo) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\Book1.xlsx");
		
		Workbook wb=WorkbookFactory.create(fi);
		
		Sheet sh =wb.getSheet(SheetName);
		org.apache.poi.ss.usermodel.Row ro= sh.getRow(RowNo);
	
	    Cell cel=((org.apache.poi.ss.usermodel.Row) ro).getCell(ColoumNo);
	    String value =cel.getStringCellValue();
		return value;
		
		
		
	}
	
	public void WriteDataIntoExcel(String SheetName,int RowNo,int ColoumNo,String data) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		FileInputStream fi=new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb=WorkbookFactory.create(fi);
			Sheet sh=	wb.getSheet("sheet1");
			Row ro= (Row) sh.getRow(RowNo);
		    Cell cel=((org.apache.poi.ss.usermodel.Row) ro).createCell(ColoumNo);
		    cel.setCellValue(data);
		    
		    FileOutputStream fos=new FileOutputStream(IPathConstants.ExcelPath);
			wb.write(fos);
		
		
		
	}
	
	
	public int getLastRowNo(String SheetName) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fi=new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=	wb.getSheet("sheet1");
		int count=sh.getLastRowNum();
		return count;
		
	}
	
	
	
	
	/*public void getList(String sheetName,WebDriver driver) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fi =new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet(sheetName);
		int count=sh.getLastRowNum();
		
		for(int i=0;i<=count;i++)
		{
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.name(key)).sendKeys(value);
		}
	}
	*/
	
	public Map<String,String> getList(String sheetName,WebDriver driver) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fi =new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet(sheetName);
		int count=sh.getLastRowNum();
		Map<String,String>map=new HashMap<String,String>();
		for(int i=0;i<=count;i++)
		{
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key,value);
			//driver.findElement(By.name(key)).sendKeys(value);
		}
		return map;
	}
	
	
	
	public Object[][] readMultipleData(String sheetName) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet(sheetName);
		int lastRow=sh.getLastRowNum()+1;
		int lastcell=sh.getRow(0).getLastCellNum();
		Object[][] obj = new Object[lastRow][lastcell];
		
		for(int i=0;i<lastRow;i++)
		{
			
			for(int j=0;j<lastcell;j++)
			{
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return obj;
	}
	

}
