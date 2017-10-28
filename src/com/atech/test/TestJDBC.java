package com.atech.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class TestJDBC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Connection conn;
		String dbName = "sample";
		String url = "jdbc:mysql://localhost:3306/sample";
		String username="root";
		String password ="r00t";
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();			
			conn = DriverManager.getConnection(url, username, password);
			System.out.println(conn);
			Statement statement = conn.createStatement();
			String sql = "select * from sampletable";
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next())
			{
				String result = resultSet.getString("Field1");
				String result1 = resultSet.getString("Field2");
				System.out.println(result);
				System.out.println(result1);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
