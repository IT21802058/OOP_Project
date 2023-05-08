package com.oop.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.oop.util.DBConnection;

public class Login_service implements Login_interface{
	
	//declaring global variables
	private static Connection conn = null;
	private static PreparedStatement stmt = null;
	private static ResultSet rslt = null;
	
	
	public int validate(String mail, String pwd, String type) {
		//declaration and initialization of local variable which store the sustomer type
		int customrtype = 0;
		
		//begining try block
		try {
			
			//get the database connection
			conn = DBConnection.getDBConnection();
			
			//sql query
			String sql = "select * from registration where email = ? and Password= ? and Usertype = ?";
			
			//insert values to the ? in the sql
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,mail);
			stmt.setString(2,pwd);
			stmt.setString(3,type);
			
			//execute the query
			rslt = stmt.executeQuery();
			
			//if succesful return
			if(rslt.next()) 
				customrtype = 1;
				
		}catch(SQLException e) {
			System.out.println("Sql error occur in com.oop.service/Login_service.java/validate FUNCTION");
			System.out.println(e);
		}
		
		//return the customer type
		return customrtype;
		
	}
	
	
	public String getNIC(String email) {
		//declaration and initialization of local variable which store the nic
		String nic = null;
		
		try {
			//get the database connection
			conn = DBConnection.getDBConnection();
			
			//sql query
			String sql = "select NIC from registration where email = ?";
			
			//insert values to the ? in the sql
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,email);
			
			//execute the query
			rslt = stmt.executeQuery();
			
			//check the success
			if(rslt.next()) 
				nic = rslt.getString(1);
			
		}catch(SQLException e) {
			System.out.println("Sql error occur in com.oop.service/Login_service.java/getNIC FUNCTION");
			System.out.println(e);
		}
		
		//return the nic values
		return nic;
	}
	
	}

