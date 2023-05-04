package com.oop.model;

/**
 * This is the Service model class
 */
public class Service {
	/*
	 * Declaring class variables
	 */
	private static String NIC;
	private int serveNo;
	private String vehicleLetters;
	private String vehicleNum;
	private String serviceType;
	private String date;
	

	public Service(int serveNo,String vehicleLetters,String vehicleNum, String serviceType, String date){
		this.serveNo = serveNo;
		this.vehicleLetters = vehicleLetters;
		this.vehicleNum = vehicleNum;
		this.serviceType = serviceType;
		this.date = date;
	}
	
	public Service() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * return NIC
	 */
	public static String getNIC() {
		return NIC;
	}
	
	/*
	 * Assign NIC value
	 */
	public void setNIC(String nIC) {
		NIC = nIC;
	}
	
	/*
	 * return NIC
	 */
	public String getVehicleLetters() {
		return vehicleLetters;
	}
	
	/*
	 * Assign NIC value
	 */
	public void setVehicleLetters(String vehicleLetters) {
		this.vehicleLetters = vehicleLetters;
	}
	
	/*
	 * return NIC
	 */
	public String getVehicleNum() {
		return vehicleNum;
	}
	
	/*
	 * Assign NIC value
	 */
	public void setVehicleNum(String vehicleNum) {
		this.vehicleNum = vehicleNum;
	}
	
	/*
	 * return NIC
	 */
	public String getServiceType() {
		return serviceType;
	}
	
	/*
	 * Assign NIC value
	 */
	public void setServiceType(int serviceType) {
		if(serviceType == 1){
			this.serviceType = "Full Service";
		}else if(serviceType == 2){
			this.serviceType = "Car wash";
		}
	}
	
	/*
	 * return NIC
	 */
	public String getDate() {
		return date;
	}
	
	/*
	 * Assign NIC value
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	
	/*
	 * return string with details
	 */
	public String toString() {
		String servtype = null;
		int type = Integer.valueOf(serviceType);
		if(type == 1)
			servtype = "Full Service";
		else if(type == 2)
			servtype = "Full Body wash";
		
		return "Customer NIC = " + NIC + "\n" + "Vehicle Letters = " + vehicleLetters + "\n" + "Vehicle Numbers = " + vehicleNum + "\n"
				+ "Service type = " + servtype + "\n" + "Service date = " + date + "\n";
	}

	public int getServeNo() {
		return serveNo;
	}

	public void setServeNo(int serveNo) {
		this.serveNo = serveNo;
	}	
	
}
