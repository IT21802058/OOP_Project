package com.oop.util;

//importing neccesary packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection conn = null;   								//declare variable from connection
	private static String url = "jdbc:mysql://localhost:3306/ovsafsms";		//conenction url
	private static String Username = "root";								//user name of the database
	private static String Password = "Root";								//password of the database
	
	//method of get database connection for other methods which return the connection
	public static Connection getDBConnection(){
		
		//begining try block
		try {
			//check where there are any connection in connection variabble
			if(conn == null || conn.isClosed()) {
				Class.forName("com.mysql.jdbc.Driver"); //enable live connection mysql database
				conn = DriverManager.getConnection(url, Username, Password);  //Connect to database
			}
		}//if there any sql error
		catch(SQLException e) {
			System.out.println("Database Connection is not successful!!!...");
			System.out.println("Error occur in com.oop.util DBConnecion.java");
		}//if there any class error
		catch(ClassNotFoundException e) {
			System.out.println("You Database connection class is not found....");
			System.out.println("Error occur in com.oop.util DBConnecion.java");
		}
		
		return conn;
	}
}	
