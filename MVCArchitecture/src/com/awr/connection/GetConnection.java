package com.awr.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {

		
		public PreparedStatement ps,ps1,ps2;
		public ResultSet rs,rs1;
		public static Connection getPsqlConnection()
		{
			
				try {
					Class.forName("org.postgresql.Driver");
				Connection	conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/javacrud", "postgres", "anwar123");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			return null;
		}
}
