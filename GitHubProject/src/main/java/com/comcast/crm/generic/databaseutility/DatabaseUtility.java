package com.comcast.crm.generic.databaseutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DatabaseUtility {
	Connection con;
	public void toGetDbConnection(String url, String username, String password) throws SQLException
	
	{
		
		try {
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		 con = DriverManager.getConnection(url, username, password);
	}
	catch (Exception e) {
		
	}
    }
	
	
	public void toGetDbConnection() throws SQLException
	{
		Connection con;
		try {
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		 con = DriverManager.getConnection("jdbc:mysql://49.249.29.4:3307/ninza_hrm", "root@%", "root");
	}
	catch (Exception e) {
		
	}
    }
 
	public void toCloseDb()
	{
		
		try
		{
			con.close();
		}
		catch (Exception e) {
			
		}
	}
	
	public ResultSet toExecuteselectQuery(String query) throws SQLException
	{
		 ResultSet result = null;
		try {
		Statement stm = con.createStatement();
		 result = stm.executeQuery(query);
		
		}
		catch (Exception e) {
			
		}
		return result;
	}
	
	public int toExecuteNonselectQuery(String query) throws SQLException
	{
		int result = 0;
		try {
		Statement stm = con.createStatement();
	     result= stm.executeUpdate(query);
		}
		catch (Exception e) {
			
		}
		return result;
	}
	

}
