package com.HRM.resource.GenericLibraries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	/**
	 * this method used to get random number
	 * author amrutha
	 * @return
	 */
	
	
	
	public int getRandomNumber()
	{
		Random ran=new Random();
		int random=ran.nextInt(10000);
		return random;
	}
	
	public String getSystemDate()
	{
		Date date=new Date();
		String systemdate = date.toString();
		return systemdate;
	}
	
	
	/**
	 * This method is used to get date and date in format
	 * @return
	 */
	public String getSystemDateInFormat()
	{
		
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-mm-yyyy HH:mm:ss");
		Date systemdate=new Date();
		String getDateAndTime=dateformat.format(systemdate);
		System.out.println(getDateAndTime);
		return getDateAndTime.replaceAll(":","-");
	}

}
