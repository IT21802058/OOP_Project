package com.oop.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.oop.model.Fuel_order;
import com.oop.model.Service;
import com.oop.util.DBConnection;
import com.oop.model.Fuel;

public class addFuelOrderimpl implements ifuelorder{
	public static final Logger log= Logger.getLogger(ifuelorder.class.getName());
	
	private static Connection connection;
	
	private static Statement statement;
	
	private static PreparedStatement preparedStatement;
	
	private static boolean isSuccess;
	
	public void addFuelOrder(Fuel_order order) {
		try {
			connection = DBConnection.getDBConnection();
			
			preparedStatement =connection.prepareStatement("insert into forder (product,size,qty,name,email)values(?,?,?,?,?)");
			connection.setAutoCommit(false);
			
			preparedStatement.setString(1,order.getProduct());
			preparedStatement.setInt(2,order.getSize());
			preparedStatement.setInt(3,order.getQty());
			preparedStatement.setString(4,order.getName());
			preparedStatement.setString(5,order.getEmail());
			
			
			preparedStatement.execute();
			connection.commit();
		}
		catch(SQLException e) {
			log.log(Level.SEVERE,e.getMessage());
			System.out.println(e);
		}
		finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} 
			catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
				System.out.println(e);
			}
			
		}
	}

	public ArrayList<Fuel_order> getShowOrder(){
		
		ArrayList<Fuel_order> arrayList = new ArrayList<Fuel_order>();
		
		try {
			connection = DBConnection.getDBConnection();
			
			preparedStatement = connection.prepareStatement("select * from forder");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Fuel_order fuelorder = new Fuel_order();
				fuelorder.setId(resultSet.getInt(1));
				fuelorder.setProduct(resultSet.getString(2));
				fuelorder.setSize(resultSet.getInt(3));
				fuelorder.setQty(resultSet.getInt(4));
				fuelorder.setName(resultSet.getString(5));
				fuelorder.setEmail(resultSet.getString(6));


				
				arrayList.add(fuelorder);
			}
			
		} catch (SQLException e) {
			log.log(Level.SEVERE, e.getMessage());
			System.out.println(e);
		} finally {
			
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
				System.out.println(e);
			}
		}
		return arrayList;
	}
	
	private String generateIDs(ArrayList<String> arrayList) {

		String id;
		int next = arrayList.size();
		next++;
		id = "C" + next;
		if (arrayList.contains(id)) {
			next++;
			id = "C" + next;
		}
		return id;
	}

	@Override
	public List<Fuel_order> getAllFuelOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkIdExist(String parameter) {
		// TODO Auto-generated method stub
		return false;
	}
	public static boolean deleteOrder(String id) {
	    int convId = Integer.parseInt(id);
	    try {
	        connection = DBConnection.getDBConnection();
	        statement = connection.createStatement();
	        String sql = "delete from forder where id='" + convId + "'";
	        int r = statement.executeUpdate(sql);
	        if (r > 0) {
	            isSuccess = true;
	        } else {
	            isSuccess = false;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return isSuccess;

	}

	public static ArrayList<Fuel> getFuelInfo() {
		java.util.ArrayList<Fuel> arrayList = new ArrayList<Fuel>();
		
		try{
			//Create a database connection
			connection = DBConnection.getDBConnection();
			
			preparedStatement = connection.prepareStatement("select * from fstorage");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()){
			Fuel fuel = new Fuel(resultSet.getString(1),resultSet.getInt(2));
			arrayList.add(fuel);
			}
			
		}	catch (SQLException e) {
			log.log(Level.SEVERE, e.getMessage());
			System.out.println(e);
		} finally {
			
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
				System.out.println(e);
			}
		}
		
		return arrayList;
	}


public void addFuel(Fuel fstorage) {
	try {
		connection = DBConnection.getDBConnection();
		
		preparedStatement =connection.prepareStatement("UPDATE fstorage SET liters = ?  WHERE fType = ?");
		connection.setAutoCommit(false);
		
		preparedStatement.setInt(1,fstorage.getLiter());
		preparedStatement.setString(2,fstorage.getfType());
		
		
		
		preparedStatement.execute();
		connection.commit();
	}
	catch(SQLException e) {
		log.log(Level.SEVERE,e.getMessage());
		System.out.println(e);
	}
	finally {
		try {
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			if (connection != null) {
				connection.close();
			}
		} 
		catch (SQLException e) {
			log.log(Level.SEVERE, e.getMessage());
	
		}
		
	}
}
}