package com.oop.service;

import org.apache.taglibs.standard.lang.jstl.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.oop.model.Payment_details;

public class PaymentServiceImpl implements iPaymentService {
	/**initialize logger*/
	public static final Logger log = Logger.getLogger(PaymentServiceImpl.class.getName());
	
	private static Connection connection;
	
	private Statement statement ;
	
	private PreparedStatement preparedStatement;
	
	/**Add a payment details*/
	public void addPaymentdetails(Payment_details payment) {
		try {
			connection = DBConnection.getDBConnection();
			preparedStatement = connection.prepareStatement("insert into Payment_details(NIC,name,email,address,city,state,bankname,cardname,cardnumber,expmonth,expyear,cvv)values (?,?,?,?,?,?,?,?,?,?,?,?)");
			connection.setAutoCommit(false);
			
			
			preparedStatement.setString(1,payment.getNIC());
			preparedStatement.setString(2,payment.getName());
			preparedStatement.setString(3,payment.getEmail());
			preparedStatement.setString(4,payment.getAddress());
			preparedStatement.setString(5,payment.getCity());
			preparedStatement.setString(6,payment.getState());
			preparedStatement.setString(7,payment.getBankname());
			preparedStatement.setString(8,payment.getCardname());
			preparedStatement.setString(9,payment.getCardnumber());
			preparedStatement.setString(10,payment.getExpmonth());
			preparedStatement.setString(11,payment.getExpyear());
			preparedStatement.setString(12,payment.getCvv());
			
			preparedStatement.execute();
			connection.commit();
			
		} catch (SQLException | ClassNotFoundException e) {
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
				log.log(Level.SEVERE,e.getMessage());
				System.out.println(e);
			}
		}
		
	    }				

/**Get payment details*/
public ArrayList<Payment_details> getPaymentByCustomer(String NIC){
	ArrayList<Payment_details> arrayList = new ArrayList<Payment_details>();
	
	try {
		connection = DBConnection.getDBConnection();
		preparedStatement = connection.prepareStatement("select p.* from Payment_details p,");
		preparedStatement.setString(1, NIC);
		
		System.out.println("preparedStatement");
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while (resultSet.next()) {
			
			Payment_details payment = new Payment_details();
			
			payment.setNIC(resultSet.getString(0));
			payment.setName(resultSet.getString(0));
			payment.setEmail(resultSet.getString(0));
			payment.setAddress(resultSet.getString(0));
			payment.setCity(resultSet.getString(0));
			payment.setState(resultSet.getString(0));
			payment.setBankname(resultSet.getString(0));
			payment.setCardname(resultSet.getString(0));
			payment.setCardnumber(resultSet.getString(0));
			payment.setExpmonth(resultSet.getString(0));
			payment.setExpyear(resultSet.getString(0));
			payment.setCvv(resultSet.getString(0));
			
			arrayList.add(payment);
		}
	}

catch (SQLException | ClassNotFoundException e) {
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
		log.log(Level.SEVERE,e.getMessage());
		System.out.println(e);
 }
}
return arrayList;
}

/**update payment details*/

public void updatePaymentdetails(Payment_details payment) {
	
	try {
		
		connection = DBConnection.getDBConnection();
		preparedStatement = connection.prepareStatement("update Payment_details set name=?,email=?,bankname=?,cardname=?,cardnumber=? where NIC=?");
		connection.setAutoCommit(false);
	}
	catch (SQLException | ClassNotFoundException e) {
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
			log.log(Level.SEVERE,e.getMessage());
			System.out.println(e);
     }
}
	
	
}
	
}
