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
import com.oop.model.ShowOrder;
import com.oop.util.DBConnection;

public class addFuelOrderimpl implements ifuelorder{
	public static final Logger log= Logger.getLogger(ifuelorder.class.getName());
	
	private static Connection connection;
	
	private static Statement statement;
	
	private PreparedStatement preparedStatement;
	
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
			
			preparedStatement = connection.prepareStatement("select id from forder");
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
}



