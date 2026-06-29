package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
	String username;
	String city;
	String email;
	String password;
	private Connection connect = null;
	private PreparedStatement pstmt =null;
	private int rowaffacted;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int register() {
		
	try {
		 connect = jdbcutill.getDBConnection();
		 System.out.println(connect);
		 
		  String sql = "INSERT INTO personalinfo(username , city,email,password)VALUES(?,?,?,?) ";
		  pstmt = connect.prepareStatement(sql);
		  pstmt.setString(1, username);
		  pstmt.setString(2, city);
		  pstmt.setString(3, email);
		  pstmt.setString(4, password);
		  
		   rowaffacted =  pstmt.executeUpdate();
		  
		  
		  
	} catch (SQLException e) {
		
		
		
		e.printStackTrace();
	} finally {
		try {
			jdbcutill.closeResource(connect, pstmt);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	return rowaffacted;
		
		
		
	}

}
