package com.atech.partyplanner;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Statement;

public class UserRegistrationService
{	
	
public void userRegistration(String name, String pwd, String confirmPassword, String gender, String dob, String address, String phoneNumber, String email)
{
	Connection conn = null;
	String url = "jdbc:mysql://localhost:3306/PartyPlanner";
	String dbName = "PartyPlanner";
	String username = "root";
	String password = "r00t";
	try
	{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		conn = DriverManager.getConnection(url, username, password);
		System.out.println(conn);
		String sql = "insert into User_Registration(Name, Password, Confirm_Password, Gender, Date_of_Birth, Address, Phone_Number, EmailID) values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, pwd);
		ps.setString(3, confirmPassword);
		ps.setString(4, gender);
		ps.setString(5, dob);
		ps.setString(6, address);
		ps.setString(7, phoneNumber);
		ps.setString(8, email);				
		int rowsUpdated = ps.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();		
	}
	//return null;
}

}

