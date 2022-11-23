package com.HRM.resource.GenericLibraries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class DataBaseUtility {

	
	/**
	 * This method is used to register and get the connection for the databse
	 * @author amrut
	 */
	Connection con=null;
	public void connectionToDB() throws SQLException
	{
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
	 con=DriverManager.getConnection(IPathConstants.dbURL, IPathConstants.dbUsername,  IPathConstants.dbPassword);
		
		
	}
	
	/**
	 * This method is used to execute query and get data for user
	 * @param query
	 * @param ColumIndex
	 * @param expdata
	 * @param data
	 * @return 
	 * @throws SQLException
	 */
	public String executeQueryAndGetData(String query, int ColumIndex,String expdata,String data) throws SQLException
	{
		boolean flag=false;
		ResultSet result=con.createStatement().executeQuery(query);
		while(result.next())
		{
		data=result.getString(ColumIndex);
		if(data.equalsIgnoreCase(expdata))
		{
			flag=true;
			break;
		}
		}
		
		
		if(flag)
		{
			System.out.println(data+".....>data verified");
			return expdata;
		}
		else
		{

			System.out.println(data+".....>data not verified");
			return "";
		}
	}
	public void closeDB() throws SQLException
	{
		con.close();
	}
}
