package com.oop.model;
/**
 * This is the User model class
 */
abstract public class User {
	/*
	 * Declaring class variables
	 */
	protected String NIC;
	protected String Name;
	protected String Phone;
	protected String email;
	protected String Username;
	protected String Password;
	protected String Usertype;
	
	/*
	 * return NIC
	 */
	protected String getNIC() {
		return NIC;
	}
	
	/*
	 * Assign NIC value
	 */
	protected void setNIC(String nIC) {
		NIC = nIC;
	}
	
	/*
	 * return name
	 */
	protected String getName() {
		return Name;
	}
	
	/*
	 * Assign name
	 */
	protected void setName(String name) {
		Name = name;
	}
	
	/*
	 * return phone number
	 */
	protected String getPhone() {
		return Phone;
	}
	
	/*
	 * Assign phone number
	 */
	protected void setPhone(String phone) {
		Phone = phone;
	}
	
	/*
	 * return email
	 */
	protected String getEmail() {
		return email;
	}
	
	/*
	 * Assign email
	 */
	protected void setEmail(String email) {
		this.email = email;
	}
	
	/*
	 * return username
	 */
	protected String getUsername() {
		return Username;
	}
	
	/*
	 * Assign username
	 */
	protected void setUsername(String username) {
		Username = username;
	}
	
	/*
	 * return password
	 */
	protected String getPassword() {
		return Password;
	}
	
	/*
	 * Assign password
	 */
	protected void setPassword(String password) {
		Password = password;
	}
	
	/*
	 * return usertype
	 */
	protected String getUsertype() {
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
