package com.atech.partyplanner;
import com.atech.partyplannerdto.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class UserHomePageService 
{
	public List<PartyDetails> getUserParties(String name) 
	{
		List<PartyDetails> parties = new ArrayList<PartyDetails>();
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
			String sql = "select p.Party_Name, p.Music, p.Food, p.Venue, p.Date, p.Time from Party_Registration p, User_Registration u, Mapping m where(u.Name=? AND u.User_ID=m.User_ID AND m.Party_ID=p.Party_ID)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				PartyDetails party = new PartyDetails();
				party.setPartyName(rs.getString("Party_Name"));
				party.setMusic(rs.getString("Music"));
				party.setFood(rs.getString("Food"));
				party.setVenue(rs.getString("Venue"));
				party.setDate(rs.getString("Date"));
				party.setTime(rs.getString("Time"));
				parties.add(party);
				System.out.println(parties.size());
			}
			System.out.println("List of parties from the dto : " +parties);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return parties;
		
		
	}
	
}
