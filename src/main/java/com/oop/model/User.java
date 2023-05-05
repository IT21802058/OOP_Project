package com.oop.model;
/**
 * This is the User model class
 */
abstract public class User {
	/*
	 * Declaring class variables
	 */
	public static String NIC;
	protected String Name;
	protected String Phone;
	protected String email;
	protected String Username;
	protected String Password;
	protected String Usertype;
	
	/*
	 * return NIC
	 */
	public String getNIC() {
		return NIC;
	}
	
	/*
	 * Assign NIC value
	 */
	public void setNIC(String nIC) {
		NIC = nIC;
	}
	
	/*
	 * return name
	 */
	public String getName() {
		return Name;
	}
	
	/*
	 * Assign name
	 */
	public void setName(String name) {
		Name = name;
	}
	
	/*
	 * return phone number
	 */
	public String getPhone() {
		return Phone;
	}
	
	/*
	 * Assign phone number
	 */
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	/*
	 * return email
	 */
	public String getEmail() {
		return email;
	}
	
	/*
	 * Assign email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/*
	 * return username
	 */
	public String getUsername() {
		return Username;
	}
	
	/*
	 * Assign username
	 */
	public void setUsername(String username) {
		Username = username;
	}
	
	/*
	 * return password
	 */
	public String getPassword() {
		return Password;
	}
	
	/*
	 * Assign password
	 */
	public void setPassword(String password) {
		Password = password;
	}
	
	/*
	 * return usertype
	 */
	public String getUsertype() {
		return Usertype;
	}
	
	/*
	 * Assign user type
	 */
	protected void setUsertype(String usertype) {
		Usertype = usertype;
	}
	
	/*
	 * abstract method
	 */
	abstract public String toString();
}
