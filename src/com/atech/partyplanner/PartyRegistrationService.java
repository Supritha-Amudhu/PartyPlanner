package com.atech.partyplanner;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PartyRegistrationService {	

	public void PartyRegistration(String partyName, String music, String food, String venue, String date, String time, String[] people)
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
			String sql = "insert into Party_Registration(Party_Name, Music, Food, Venue, Date, Time) values(?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, partyName);
			ps.setString(2, music);
			ps.setString(3, food);
			ps.setString(4, venue);
			ps.setString(5, date);
			ps.setString(6, time);		
			ps.executeUpdate();
			//conn.commit();
			String sql1 = "select Party_ID from Party_Registration where Party_Name = ?";
			PreparedStatement ps1 = conn.prepareStatement(sql1);
			ps1.setString(1, partyName);
			ResultSet resultSet = ps1.executeQuery();
			String partyID=null;
			while(resultSet.next())
			{
				partyID = resultSet.getString("Party_ID");
			}
			//System.out.println(people);
			for(int i=0;i<people.length;i++)
			{
				String sql2 = "insert into Mapping(User_ID, Party_ID) values((select User_ID from User_Registration where Name=?),?)";
				ps1 = conn.prepareStatement(sql2);
				ps1.setString(1, people[i]);
				ps1.setString(2, partyID);
				ps1.executeUpdate();
			}
			//conn.commit();			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
