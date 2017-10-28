package com.atech.partyplanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.atech.partyplannerdto.PartyDetails;

public class AdminPartyListDisplayService 
{
	public List<PartyDetails> getAllParties() 
	{
		List<PartyDetails> parties1 = new ArrayList<PartyDetails>();
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/PartyPlanner";
		String dbName = "User_Registration";
		String username = "root";
		String password = "r00t";
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, username, password);
			System.out.println(conn);
			String sql = "select * from Party_Registration";
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next())
			{
				PartyDetails party1 = new PartyDetails();
				party1.setPartyID(rs.getString("Party_ID"));
				party1.setPartyName(rs.getString("Party_Name"));
				party1.setMusic(rs.getString("Music"));
				party1.setFood(rs.getString("Food"));
				party1.setVenue(rs.getString("Venue"));
				party1.setDate(rs.getString("Date"));
				party1.setTime(rs.getString("Time"));
				parties1.add(party1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return parties1;
	}
	

}
