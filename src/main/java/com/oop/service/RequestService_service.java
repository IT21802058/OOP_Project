package com.oop.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.oop.util.DBConnection;
import java.util.ArrayList;
import com.oop.model.Service;

public class RequestService_service {
	
	//declaring global variables
	private static Connection conn = null;
	private static PreparedStatement stmt = null;
	private static ResultSet rslt = null;
	private static int result = 0;	
	
	public static int validateRequest(String nic, String Vltrs, String Vnmbrs, String type, String date) {		
		
		//begining try block
		try {
			//get the database connection
			conn = DBConnection.getDBConnection();
			
			//sql query
			String sql = "select serviceno from service where NIC = ? and vehicleLetters = ? and vehicleNo = ? and ServiceType = ? and servicedate = ?";
			
			//insert values to the ? in the sql
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,nic);
			stmt.setString(2,Vltrs);
			stmt.setString(3,Vnmbrs);
			stmt.setString(4,type);
			stmt.setString(5,date);
			
			//execute the query
			rslt = stmt.executeQuery();
			
			//if succesful return
			if(rslt.next()) 
				result = 1;
				
		}catch(SQLException e) {
			System.out.println("Sql error occur in com.oop.service/RequestService_service.java/validateRequest FUNCTION");
			System.out.println(e);
		}finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("There is an error wen closing the connection and preparedStatemnt in RequestService_service.java/validateRequest");
			}
		}
		
		//return result value
		return result;
	}
	
	
	
	public static int InsertRequest(String nic, String Vltrs, String Vnmbrs, String type, String date) {
		
		//begining try block
		try {
			//get the database connection
			conn = DBConnection.getDBConnection();
		
			//sql query
			String sql = "insert into service(NIC,vehicleLetters,vehicleNo,ServiceType,servicedate) values(?,?,?,?,?)";
		
			//insert values to the ? in the sql
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,nic);
			stmt.setString(2,Vltrs);
			stmt.setString(3,Vnmbrs);
			stmt.setString(4,type);
			stmt.setString(5,date);
			
			//execute the query
			int rsult = stmt.executeUpdate();
		
			//if succesful return and else return
			if(rsult>0) 
				result = 1;
			else 
				result = 0;
			
	}catch(SQLException e) {
		System.out.println("Sql error occur in com.oop.service/RequestService_service.java/InsertRequest FUNCTION");
		System.out.println(e);
	}finally {
		/*
		 * Close prepared statement and database connectivity at the end of
		 * transaction
		 */
		try {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("There is an error wen closing the connection and preparedStatemnt in RequestService_service.java/InsertRequest");
		}
	}
	
	//return result value
	return result;
	}
	
	
	
	public static int EditRequest(String serNo, String Vltrs, String Vnmbrs, String type, String date) {
		
		//begining try block
		try {
			//get the database connection
			conn = DBConnection.getDBConnection();
				
			//sql query
			String sql = "update service set vehicleLetters = ?, vehicleNo = ?, ServiceType = ?, servicedate = ? where serviceno = ?";
		
			//insert values to the ? in the sql
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,Vltrs);
			stmt.setString(2,Vnmbrs);
			stmt.setString(3,type);
			stmt.setString(4,date);
			stmt.setString(5,serNo);
			
			//execute the query
			int rsult = stmt.executeUpdate();
		
			//if succesful return and else return
			if(rsult>0) 
				result = 1;
			else 
				result = 0;
			
	}catch(SQLException e) {
		System.out.println("Sql error occur in com.oop.service/RequestService_service.java/EditRequest FUNCTION");
		System.out.println(e);
	}finally {
		/*
		 * Close prepared statement and database connectivity at the end of
		 * transaction
		 */
		try {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("There is an error wen closing the connection and preparedStatemnt in RequestService_service.java/EditRequest");
		}
	}
	
	//return result value
	return result;
	}
	
	
	
	public static int DeleteRequest(String serNo) {
		
		//begining try block
		try {
			//convert the string type value to a interger using wrapper class
			int ID = Integer.parseInt(serNo);
			
			//get the database connection
			conn = DBConnection.getDBConnection();
			Statement st = conn.createStatement();
			
			//sql query
			String sql = "delete from service where serviceno='"+ID+"'";
			
			//execute the query
			int rsult = st.executeUpdate(sql);
			
			//if succesful return and else return
			if(rsult > 0) 
				result = 1;
			else
				result = 0;
				
		}catch(SQLException e) {
			System.out.println("Sql error occur in com.oop.service/RequestService_service.java/DeleteRequest FUNCTION");
			System.out.println(e);
		}finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("There is an error wen closing the connection in RequestService_service.java/DeleteRequest");
			}
		}
		
	//return result value
	return result;
	}
	
	public static ArrayList<Service> getAllServices() {
		ArrayList<Service> arrayList = new ArrayList<Service>();
		
		try{
			//Create a database connection
			conn = DBConnection.getDBConnection();
			
			//take the nic value from model service
			String nic = Service.getNIC();
		
			//Sql query
			String sql = "select * from service where NIC='" + nic +"'";
			
			//prepare the statment
			stmt = conn.prepareStatement(sql);
		
			//execute the query
			rslt = stmt.executeQuery(sql);
		
			//starting of printing values in table
			while(rslt.next()){
			Service service = new Service();
			
			service.setServeNo(rslt.getInt(1));
			service.setVehicleLetters(rslt.getString(3));
			service.setVehicleNum(rslt.getString(4));
			service.setServiceType(rslt.getInt(5));
			service.setDate(rslt.getString(6));
			
			arrayList.add(service);
			
			}
		}catch(SQLException e){
			System.out.println("sql query is incorrect in RequestService_service.java/getAllServices"); //Check if sql query exception
			System.out.println(e);
		}finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("There is an error wen closing the connection and preparedStatemnt in RequestService_service.java/getAllServices");
			}
		}
		return arrayList;
	}
}
