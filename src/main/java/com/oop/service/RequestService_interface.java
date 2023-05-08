package com.oop.service;

import java.util.ArrayList;

import com.oop.model.Service;

public interface RequestService_interface {

	//validate the requested service
	public int validateRequest(String nic, String Vltrs, String Vnmbrs, String type, String date);
		
	//insert a requestt
	public int InsertRequest(String nic, String Vltrs, String Vnmbrs, String type, String date);
	
	//edit the request
	public int EditRequest(String serNo, String type, String date);
	
	//delete the request
	public int DeleteRequest(String serNo);
	
	//get the list and display
	public ArrayList<Service> getAllServices();
	
	//get the vehicle letters
	public String getVLettrs(String servno);
	
	//get the vehicle number
	public String getNumber(String servno);
	
}
