package com.oop.service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.oop.model.Fuel;
public class FuelStorage {
	public static List<Fuel> validate(String fuelType,int fLiters ){
		ArrayList<Fuel> fuel=new ArrayList<>();
		
		//create database connection
		String url="jdbc:mysql://localhost:3306/ovsafsms";
		String user="root";
		String password="root";
		
		//validate
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url,user,password);
			Statement stmt=con.createStatement();
			
			String sql="select * from FuelStorage where fType='"+fuelType+"'and liters=0'"+fLiters+"'";
			ResultSet rs=stmt.executeQuery(sql);
			
			if (rs.next()) {
				String fType =rs.getString(1);
				int liters=rs.getInt(2);
				
				Fuel f= new Fuel(fType,liters);
				fuel.add(f);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return fuel;
		
	}
}
