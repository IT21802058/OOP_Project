package com.oop.service;

import com.oop.model.Customer;
import com.oop.model.Service;
import com.oop.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerImpl implements iCustomer{
	
	/** Initialize logger */
	public static final Logger log = Logger.getLogger(CustomerImpl.class.getName());
	
	private static Connection connection;

	private static Statement statement;
	
	private PreparedStatement preparedStatement;
	
	
	/**Registering Customer*/
	
	@Override
	public void addCustomer(Customer customer) {
				
		try {
			connection = DBConnection.getDBConnection();
			
			preparedStatement = connection.prepareStatement("insert into registration(NIC,Name,Phone,email,Username,Password,City) values(?,?,?,?,?,?,?)");
			connection.setAutoCommit(false);
						
			preparedStatement.setString(1, customer.getNIC());
			preparedStatement.setString(2, customer.getName());
			preparedStatement.setString(3, customer.getPhone());
			preparedStatement.setString(4, customer.getEmail());
			preparedStatement.setString(5, customer.getUsername());
			preparedStatement.setString(6, customer.getPassword());
			preparedStatement.setString(7, customer.getCity());
			
			preparedStatement.execute();
			connection.commit();
			
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
		
	}
	
	
	public boolean checkNICExist(String NIC) {
		boolean userExist = false;
		try {
			connection = DBConnection.getDBConnection();
			
			preparedStatement = connection.prepareStatement("select NIC from registration where NIC = ?");
			
			preparedStatement.setString(1, NIC);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				if(resultSet.getString("NIC") != "" || resultSet.getString("NIC") != null) {
					userExist = true;
				}
				else {
					userExist = false;
				}
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
		return userExist;
	}
	
	@Override
	public void deleteCustomer(String NIC) {
				
		try {
			connection = DBConnection.getDBConnection();
			
			preparedStatement = connection.prepareStatement("delete from registration where NIC = ? ");
			connection.setAutoCommit(false);
			
			preparedStatement.setString(1, NIC);
			
			preparedStatement.execute();
			connection.commit();
			
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
		
	}
	
	@Override
	public ArrayList<Customer> getCustomerdeatails() {
		
		ArrayList<Customer> arrayList = new ArrayList<Customer>();
		Customer customer = new Customer();
						
		try {
			connection = DBConnection.getDBConnection();
			
			preparedStatement = connection.prepareStatement("select Name, Phone, email, City,Username, Password from registration where NIC = ?");
			
			preparedStatement.setString(1, Customer.NIC);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			
			customer.setName(resultSet.getString(1));
			customer.setPhone(resultSet.getString(2));
			customer.setEmail(resultSet.getString(3));
			customer.setCity(resultSet.getString(4));
			customer.setUsername(resultSet.getString(5));
			customer.setPassword(resultSet.getString(6));
			
			
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
		 
}

