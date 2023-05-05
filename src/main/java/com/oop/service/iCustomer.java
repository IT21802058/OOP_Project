package com.oop.service;

import java.util.ArrayList;
import java.util.logging.Logger;
import com.oop.model.Customer;
import com.oop.model.Service;

public interface iCustomer {
	/** Initialize logger */
	public static final Logger log = Logger.getLogger(iCustomer.class.getName());
	
	/** Add a Customer*/
	public void addCustomer(Customer customer);
	
	/** check if user exists */
	public boolean checkNICExist(String NIC);
	
	public void deleteCustomer(String NIC);
	
	public ArrayList<Customer> getCustomerdeatails();
}
