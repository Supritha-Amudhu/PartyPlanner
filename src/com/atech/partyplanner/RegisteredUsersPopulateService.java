package com.atech.partyplanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class RegisteredUsersPopulateService
{	
	public static void main(String[] args)
	{
		RegisteredUsersPopulateService sample = new RegisteredUsersPopulateService();
		sample.populateRegisteredUsers();
	}
	ArrayList userList = new ArrayList();
	public ArrayList populateRegisteredUsers()
	{
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "PartyPlanner";
		String username = "root";
		String password = "r00t";
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url+dbName, username, password);
			Statement statement = conn.createStatement();
			String sql = "select Name from User_Registration";
			ResultSet resultSet = statement.executeQuery(sql);			
			int i=0;
			while(resultSet.next())
			{
				String users = resultSet.getString("Name");	
				userList.add(users);
				i++;				
			}		
			//System.out.println(userList);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return userList;
	}

	}
