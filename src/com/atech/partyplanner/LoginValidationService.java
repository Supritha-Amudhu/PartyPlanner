package com.atech.partyplanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginValidationService
{
	public String validateUser(String uname, String pwd)
	{
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/PartyPlanner";
		String username = "root";
		String password = "r00t";
		String result=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, username, password);
			System.out.println(conn);
			String sql = "select Password from User_Registration where Name=?";
			PreparedStatement preparestatement = conn.prepareStatement(sql);
			preparestatement.setString(1, uname);
			ResultSet resultSet = preparestatement.executeQuery();
			while(resultSet.next())
			{
				String passwordList = resultSet.getString("Password");
				if(pwd.equals(passwordList))
				{
					result = uname;
				}
				result=uname;
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return result;
	}
	
	

}
