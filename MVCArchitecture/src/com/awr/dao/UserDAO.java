package com.awr.dao;

import java.sql.SQLException;

import com.awr.connection.GetConnection;

public class UserDAO {

		public boolean validateUser(String uname,String pass)
		{
			
			String sql="select * from public.user where uname =? and pass =?";
			GetConnection gc=new GetConnection();
			System.out.println(uname+" "+pass);
			try {
				System.out.println("entered dao try");
				gc.ps=GetConnection.getPsqlConnection().prepareStatement(sql);
				gc.ps.setString(1, uname);
				gc.ps.setString(2, pass);
				
				gc.rs=gc.ps.executeQuery();
				return gc.rs.next();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}
}
