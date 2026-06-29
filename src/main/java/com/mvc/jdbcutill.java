package com.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.tomcat.dbcp.dbcp2.PStmtKey;

public class jdbcutill {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("Driver is registerd");
	}
	
	public static Connection getDBConnection() throws SQLException{
		
        String url = "jdbc:mysql://localhost:3306/info";
		String user = "YOUR_USERNAME";
		String Password = "_YOUR _Password";
		return DriverManager.getConnection(url,user ,Password);
		
	}
	
	public static void closeResource( Connection connect, PreparedStatement pstmt) throws SQLException {
		
		if(connect !=null) {
			connect.close();
		}
		
		if(pstmt !=null) {
			pstmt.close();
		}
		
	}

}
