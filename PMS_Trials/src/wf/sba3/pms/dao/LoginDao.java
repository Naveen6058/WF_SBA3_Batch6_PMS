package wf.sba3.pms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import wf.sba3.pms.model.Login;

public class LoginDao 
{
	private String DBURL = "jdbc:mysql://localhost:3306/pms";
	private String DBUsername = "root";
	private String DBPassword = "";
	private String DBDriver = "com.mysql.cj.jdbc.Driver";
	
	
	public void loadDriver(String DBDriver)
	{
		try 
		{
			Class.forName(DBDriver);
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection connection = null;
		try 
		{
			connection = DriverManager.getConnection(DBURL, DBUsername, DBPassword);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	public boolean validate(Login login) 
	{
		loadDriver(DBDriver);
		Connection con = getConnection();
		boolean status = false;
		
		String sql = "select * from user where userID=? and password=?";
		
		PreparedStatement ps;
		try 
		{
			ps = con.prepareStatement(sql);
			ps.setString(1, login.getUsername());
			ps.setString(2, login.getPassword());
			
			ResultSet rs = ps.executeQuery();
			
			status = rs.next();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		
		return status;		
	}	
}