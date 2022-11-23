package com.HRM.resource.GenericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	/**
	 * This method is used to read data from propery file.
	 * @author amrut
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String  ReadDataFromPropertyFile(String key) throws IOException {

	

			FileInputStream fis=new FileInputStream(IPathConstants.FilePath);
			
			Properties pobj=new Properties();
			
			pobj.load(fis);
			
			String value=pobj.getProperty(key);
			return value;
	}
			
			
	
	
}
